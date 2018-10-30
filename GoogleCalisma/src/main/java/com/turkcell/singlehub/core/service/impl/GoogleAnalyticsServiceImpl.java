package com.turkcell.singlehub.core.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.analytics.Analytics;
import com.google.api.services.analytics.AnalyticsScopes;
import com.google.api.services.analytics.model.GaData;
import com.turkcell.singlehub.core.service.GoogleAnalyticsService;


@Service("googleAnalyticsService")
public class GoogleAnalyticsServiceImpl implements GoogleAnalyticsService {

	/**
	 * Be sure to specify the name of your application. If the application name is {@code null} or blank, the application will log a warning. Suggested format is
	 * "MyCompany-ProductName/1.0".
	 */
	private final String applicationName = "Turkcell-SingleHubTest";

	/** E-mail address of the service account. */
	private String serviceAccountEmail;

	/** Global instance of the HTTP transport. */
	private HttpTransport httpTransport;

	/** Global instance of the JSON factory. */
	private final JsonFactory jsonFactory = new JacksonFactory();

	private File keyFile = null;


	public GaData getGaDataForSingleHub(String locationPath, String category) throws Exception {

		httpTransport = GoogleNetHttpTransport.newTrustedTransport();

		// Initialize the request to Google Analytics
		Analytics analytics = initializeAnalytics();

		// Turkcell id
		//String profileId = configurationManager.getParam("definitions.google.analytics.api.profile.id");
		String profileId ="70812365";

		// Gets the values from Google Analytics
		return executeDataQuery(analytics, profileId, locationPath, category);
	}

	
	private Analytics initializeAnalytics() throws Exception {
		if ( keyFile == null ) {
			try {
				//String filename = configurationManager.getParam("definitions.google.analytics.api.key.filename", "key.p12");
				String filename = "key.p12";
				//String filename = "GAkeyprod.p12";

				InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("googleanalyticskey/" + filename);

				URL url = this.getClass().getProtectionDomain().getCodeSource().getLocation();
				keyFile = new File(url.getFile() + "testkey.p12");

				OutputStream outputStream = new FileOutputStream(keyFile);

				int read = 0;
				byte[] bytes = new byte[1024];

				while ((read = inputStream.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);
				}

				outputStream.flush();
				outputStream.close();

			} catch (Exception e) {
				System.out.println("Google Analytics Credential key file is not found.");
			}
		}

		if ( StringUtils.isEmpty(serviceAccountEmail) ) {
			//serviceAccountEmail = configurationManager.getParam("definitions.google.analytics.api.account.email");
			serviceAccountEmail="596509745240@developer.gserviceaccount.com";
		}

		// Authorization
		GoogleCredential credential = new GoogleCredential.Builder().setTransport(httpTransport).setJsonFactory(jsonFactory)
				.setServiceAccountId(serviceAccountEmail).setServiceAccountScopes(AnalyticsScopes.ANALYTICS)
				.setServiceAccountPrivateKeyFromP12File(keyFile).build();

		return new Analytics.Builder(httpTransport, jsonFactory, credential).setApplicationName(applicationName).build();
	}

	private GaData executeDataQuery(Analytics analytics, String profileId, String locationPath, String category) throws IOException {
		Date endDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		// cache key
		String key = category + locationPath;

		GaData gaData = null;

		if ( gaData == null ) {
			gaData = analytics.data().ga().get("ga:" + profileId, // Table Id. ga: + profile id.
					"2012-01-01", // Start date.
					dateFormat.format(endDate), // End date
					"ga:uniqueEvents").setDimensions("ga:eventLabel,ga:eventCategory,ga:eventAction")
					.setFilters("ga:eventLabel==" + locationPath + ";ga:eventCategory==" + category).execute();
		}
		return gaData;
	}

	public Double calculateRatio(GaData results) {
		Double counterTotal = new Double(0);
		Double counterYes = new Double(0);
		Double ratio = new Double(0d);

		if ( results.getRows() == null || results.getRows().isEmpty() ) {
			System.out.println("No results Found");
		} else {
			for (List<String> row : results.getRows()) {
				counterTotal += Integer.valueOf(row.get(3));
				if ( row.get(2).equals("Evet") ) {
					counterYes += Integer.valueOf(row.get(3));
				}
			}
		}

		if ( counterTotal != 0 ) {
			ratio = ((counterYes / counterTotal) * 100);
		}
		System.out.println(ratio + " ratio");
		// Double return edip, ondalikli kismi buna dahil etmek istemiyoruz. gokhanozg.
		return new Double(ratio.intValue());
	}

	public Integer calculateTotalVotes(GaData results) {
		Integer counterTotal = new Integer(0);
		Integer counterYes = new Integer(0);

		if ( results.getRows() == null || results.getRows().isEmpty() ) {
			System.out.println("No results Found");
		} else {
			for (List<String> row : results.getRows()) {
				counterTotal += Integer.valueOf(row.get(3));
				if ( row.get(2).equals("Evet") ) {
					counterYes += Integer.valueOf(row.get(3));
				}
			}
		}

		return counterYes;
	}

}
