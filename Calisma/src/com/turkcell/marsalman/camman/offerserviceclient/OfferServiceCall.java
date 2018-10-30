package com.turkcell.marsalman.camman.offerserviceclient;

import java.net.URL;

import com.turkcell.marsalman.camman.common.data.model.campaigndefinition.CampaignsDefinitionType;
import com.turkcell.marsalman.camman.webservices.service.OfferService;
import com.turkcell.marsalman.camman.webservices.service.OfferServicePortType;

public class OfferServiceCall {
	
	public static void main(String[] args) {
		
		OfferServiceCall offerServiceCall = new OfferServiceCall();
		try {
			offerServiceCall.callws();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void callws() throws Exception{
		
		OfferService offerService = new OfferService(new URL("http://extstablews.sd.turkcell.com.tr/camman/camman/offerservice/offerservicews?wsdl"));
		OfferServicePortType offerServicePortType = offerService.getOfferServiceHttpPort();
		
		CampaignsDefinitionType campaignsDefinitionType = offerServicePortType.getCampaignDefinitions();
		
		 System.out.println(campaignsDefinitionType);
		 campaignsDefinitionType.getCampaignMandatoryDefinitions().getValue().getCampaignMandatoryDefinition().get(0).getMandatoryDefinitions().getValue().getMandatoryDefinition().get(0).getOfferTypeIds().getValue().getLong().get(0);
		
	}

}
