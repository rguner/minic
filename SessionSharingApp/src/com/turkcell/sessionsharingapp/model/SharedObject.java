package com.turkcell.sessionsharingapp.model;

import java.io.Serializable;
import java.util.Date;

public class SharedObject implements Serializable {

	private static final long serialVersionUID = 1305976233542172475L;
	private String s;
	private SharedObjectInner sharedObjectInner;

	public SharedObjectInner getSharedObjectInner() {
		return sharedObjectInner;
	}

	public void setSharedObjectInner(SharedObjectInner sharedObjectInner) {
		this.sharedObjectInner = sharedObjectInner;
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
