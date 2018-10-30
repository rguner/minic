package com.guner.sonar.denemeler;


public class PaketlerimUtils {

	public enum getPacketListByMsisdn_INPUT {
		MSISDN
	};

	public enum getPacketListByMsisdn_OUTPUT {
		OPERATION_STATUS, EXCEPTION, RESULT_DATA
	};

	public enum OPERATION_STATUS {
		SUCCESS, FAIL
	};
	
	private static String multiThreadedUsageDeneme;

	public static GetPacketListByMsisdnOutput getCategoryListByMsisdn(GetPacketListByMsisdnInput input) 
	{

		final String msisdn = input.getMsisdn();

		String deneme=msisdn;
		multiThreadedUsageDeneme= msisdn;

		GetPacketListByMsisdnOutput output = new GetPacketListByMsisdnOutput(
				deneme, OPERATION_STATUS.SUCCESS);
		
		System.out.println("multiThreadedUsageDeneme -->" + multiThreadedUsageDeneme);

		return output;

	}

	public static class GetPacketListByMsisdnInput {

		private String msisdn;

		public GetPacketListByMsisdnInput(String msisdn) {
			this.msisdn = msisdn;
		}

		public String getMsisdn() {
			return msisdn;
		}

	}

	public static class GetPacketListByMsisdnOutput {

		private OPERATION_STATUS operationStatus;

		private Exception exception;

		private String msisdn;

		public GetPacketListByMsisdnOutput(
				String msisdn,
				OPERATION_STATUS operationStatus) {
			this.msisdn=msisdn;
			this.operationStatus = operationStatus;
			this.exception = null;
		}

		public GetPacketListByMsisdnOutput(
				String msisdn,
				OPERATION_STATUS operationStatus, Exception exception) {
			this.msisdn=msisdn;
			this.operationStatus = operationStatus;
			this.exception = exception;
		}

		public Exception getException() {
			return exception;
		}

		public OPERATION_STATUS getOperationStatus() {
			return operationStatus;
		}

		public String getMsisdn() {
			return msisdn;
		}

	}

}