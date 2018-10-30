package com.turkcell.singlehub.core.service;

import com.google.api.services.analytics.model.GaData;

public interface GoogleAnalyticsService {


	public GaData getGaDataForSingleHub(String locationPath, String category) throws Exception;

}
