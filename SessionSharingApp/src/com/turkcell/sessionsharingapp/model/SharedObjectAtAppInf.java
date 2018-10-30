package com.turkcell.sessionsharingapp.model;

import java.util.Date;

public class SharedObjectAtAppInf {

	private static final long serialVersionUID = 5740525448521353549L;
	private String s;
	private SharedObjectInnerAtAppInf sharedObjectInnerAtAppInf;

	public SharedObjectInnerAtAppInf getSharedObjectInnerAtAppInf() {
		return sharedObjectInnerAtAppInf;
	}

	public void setSharedObjectInnerAtAppInf(SharedObjectInnerAtAppInf sharedObjectInnerAtAppInf) {
		this.sharedObjectInnerAtAppInf = sharedObjectInnerAtAppInf;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private int i;
	private Date date;

}
