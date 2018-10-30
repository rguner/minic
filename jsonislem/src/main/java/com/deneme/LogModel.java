package com.deneme;

import java.io.Serializable;
import java.util.Date;

public class LogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2552488552641958192L;
	private LogProcess logProcess;
	private LogProcessType logProcessType;

	private String msisdn;
	private String token;
	private String clientSecret;
	private String captcha;
	private String otp;
	private String emailToken;
	private String accountId;
	private Date createdDate;
	private String email;
	private long rememberMeId;
	private long transferId;
	private long oldRmId;
	private long sourceRmId;
	private boolean googleAccount;

	public LogModel() {}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public long getTransferId() {
		return transferId;
	}

	public void setTransferId(long transferId) {
		this.transferId = transferId;
	}

	public long getOldRmId() {
		return oldRmId;
	}

	public void setOldRmId(long oldRmId) {
		this.oldRmId = oldRmId;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public LogProcessType getLogProcessType() {
		return logProcessType;
	}

	public void setLogProcessType(LogProcessType logProcessType) {
		this.logProcessType = logProcessType;
	}

	public LogProcess getLogProcess() {
		return logProcess;
	}

	public void setLogProcess(LogProcess logProcess) {
		this.logProcess = logProcess;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public long getRememberMeId() {
		return rememberMeId;
	}

	public void setRememberMeId(long rememberMeId) {
		this.rememberMeId = rememberMeId;
	}

	public long getSourceRmId() {
		return sourceRmId;
	}

	public void setSourceRmId(long sourceRmId) {
		this.sourceRmId = sourceRmId;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getEmailToken() {
		return emailToken;
	}

	public void setEmailToken(String emailToken) {
		this.emailToken = emailToken;
	}

	public boolean isGoogleAccount() {
		return googleAccount;
	}

	public void setGoogleAccount(boolean googleAccount) {
		this.googleAccount = googleAccount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LogModel [logProcess=");
		builder.append(logProcess);
		builder.append(", logProcessType=");
		builder.append(logProcessType);
		builder.append(", msisdn=");
		builder.append(msisdn);
		builder.append(", token=");
		builder.append(token);
		builder.append(", clientSecret=");
		builder.append(clientSecret);
		builder.append(", captcha=");
		builder.append(captcha);
		builder.append(", otp=");
		builder.append(otp);
		builder.append(", emailToken=");
		builder.append(emailToken);
		builder.append(", accountId=");
		builder.append(accountId);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", email=");
		builder.append(email);
		builder.append(", rememberMeId=");
		builder.append(rememberMeId);
		builder.append(", transferId=");
		builder.append(transferId);
		builder.append(", oldRmId=");
		builder.append(oldRmId);
		builder.append(", sourceRmId=");
		builder.append(sourceRmId);
		builder.append(", googleAccount=");
		builder.append(googleAccount);
		builder.append(", serviceResult=");
		builder.append("]");
		return builder.toString();
	}

}
