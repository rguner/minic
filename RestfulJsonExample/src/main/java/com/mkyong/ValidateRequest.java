package com.mkyong;

import java.io.Serializable;

public class ValidateRequest implements Serializable {

	private static final long serialVersionUID = 5936347396487650739L;

	private int serviceId;
	private String secretKey;
	private String authToken;

	public ValidateRequest() {}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
