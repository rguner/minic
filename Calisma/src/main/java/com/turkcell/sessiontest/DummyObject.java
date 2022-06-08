package com.turkcell.sessiontest;

import java.io.Serializable;

public class DummyObject  implements Serializable{

	private static final long serialVersionUID = -4782505455812600911L;
	private String dummyStr;
	
	public String getDummyStr() {
		return dummyStr;
	}
	public void setDummyStr(String dummyStr) {
		this.dummyStr = dummyStr;
	}
	

}
