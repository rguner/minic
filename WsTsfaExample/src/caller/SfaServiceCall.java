package caller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.BindingProvider;

import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import com.turkcell.crm.sfa.service.endpoints.PositionService;
import com.turkcell.crm.sfa.service.endpoints.PositionServiceEndPoint;
import com.turkcell.crm.sfa.service.endpoints.SolPositionHierarchyRequest;
import com.turkcell.crm.sfa.service.endpoints.SolPositionHierarchyResponse;

public class SfaServiceCall {

	public static void main(String[] args) {
		SfaServiceCall sfaServiceCall = new SfaServiceCall();
		System.out.println("------------------ sfaServiceCall CALL ------------------");
		try {
			// sfaServiceCall.positionServiceCall();
			sfaServiceCall.positionServiceCallWithValidation();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------ sfaServiceCall CALL ENDED ------------");

	}

	private void positionServiceCall() throws Exception {
		URL url = null;
		try {
			url = new URL("http://extstablews.sd.turkcell.com.tr/tsfaws/PositionService?wsdl");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PositionService oim = new PositionService();
		System.out.println("PositionService alindi...");
		PositionServiceEndPoint positionServiceEndPoint = oim.getPositionServiceEndPointPort();
		BindingProvider bp = (BindingProvider) positionServiceEndPoint;
		SolPositionHierarchyRequest solPositionHierarchyRequest = new SolPositionHierarchyRequest();
		// <systemId>0</systemId>
		// <userId>DUMMYCC</userId>
		// <operationCode>SFAISO050</operationCode>
		// <transactionDate>2014-12-16T15:44:55.873+02:00</transactionDate>
		// <transactionId>-7482858578624189212</transactionId>
		// <employeeId>11512</employeeId>

		solPositionHierarchyRequest.setSystemId(0);
		solPositionHierarchyRequest.setUserId("DUMMYCC");
		solPositionHierarchyRequest.setOperationCode("SFAISO050");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		solPositionHierarchyRequest.setTransactionDate(date2);
		solPositionHierarchyRequest.setTransactionId(new Long(12344321));
		solPositionHierarchyRequest.setEmployeeId(11512);

		SolPositionHierarchyResponse result = null;
		result = positionServiceEndPoint.getSOLPositionHierarchy(solPositionHierarchyRequest);
		System.out.println("Called PositionService " + result.toString() + "  " + result.getSolPositionHierarchyList().get(0).getEmployee().getTeamCode());

	}

	private void positionServiceCallWithValidation() throws Exception {
		URL url = null;
		try {
			url = new URL("http://extstablews.sd.turkcell.com.tr/tsfaws/PositionService?wsdl");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SchemaFactory s = new SchemaFactory() {

			@Override
			public void setResourceResolver(LSResourceResolver resourceResolver) {
				// TODO Auto-generated method stub

			}

			@Override
			public void setErrorHandler(ErrorHandler errorHandler) {
				// TODO Auto-generated method stub

			}

			@Override
			public Schema newSchema(Source[] schemas) throws SAXException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Schema newSchema() throws SAXException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isSchemaLanguageSupported(String schemaLanguage) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public LSResourceResolver getResourceResolver() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ErrorHandler getErrorHandler() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		SchemaValidationFeature feature = new SchemaValidationFeature();

		PositionService oim = new PositionService();
		System.out.println("PositionService alindi...");
		PositionServiceEndPoint positionServiceEndPoint = oim.getPositionServiceEndPointPort();
		BindingProvider bp = (BindingProvider) positionServiceEndPoint;
		SolPositionHierarchyRequest solPositionHierarchyRequest = new SolPositionHierarchyRequest();
		// <systemId>0</systemId>
		// <userId>DUMMYCC</userId>
		// <operationCode>SFAISO050</operationCode>
		// <transactionDate>2014-12-16T15:44:55.873+02:00</transactionDate>
		// <transactionId>-7482858578624189212</transactionId>
		// <employeeId>11512</employeeId>

		solPositionHierarchyRequest.setSystemId(0);
		solPositionHierarchyRequest.setUserId("DUMMYCC");
		solPositionHierarchyRequest.setOperationCode("SFAISO050");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		solPositionHierarchyRequest.setTransactionDate(date2);
		solPositionHierarchyRequest.setTransactionId(new Long(12344321));
		solPositionHierarchyRequest.setEmployeeId(11512);

		SolPositionHierarchyResponse result = null;
		result = positionServiceEndPoint.getSOLPositionHierarchy(solPositionHierarchyRequest);
		System.out.println("Called PositionService " + result.toString() + "  " + result.getSolPositionHierarchyList().get(0).getEmployee().getTeamCode());

	}
}
