package com.guner.sonar.denemeler;

import java.io.Serializable;

public class SerializableOrnek2 implements Serializable {

	private static final long serialVersionUID = -1236160141903792378L;
	private String text2 = "text2";

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

}
