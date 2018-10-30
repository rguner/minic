package com.guner.jacksonexample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

	private static final long serialVersionUID = -7682084118360344413L;
	private int age = 29;
	private String name = "mkyong";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	private List<String> messages = new ArrayList<String>() {

		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};

	// getter and setter methods

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " +
				"messages=" + messages + "]";
	}
}
