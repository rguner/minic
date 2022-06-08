package com.turkcell.sessiontest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestObject implements Serializable{

	static final long serialVersionUID = 2783788945851133973L;
	
	private String field1;
	private Integer field2;
	private Vector<DummyObject> elements;
	private List<DummyObject> list;
			
	public TestObject() 
	{
		setElements(new Vector<DummyObject>());
		DummyObject dummyObject = new DummyObject();
		dummyObject.setDummyStr("ram");
		DummyObject dummyObject0 = new DummyObject();
		dummyObject0.setDummyStr("ram0");
		getElements().add(dummyObject);
		getElements().add(dummyObject0);
		
		list= new ArrayList<DummyObject>();
		DummyObject dummyObject1 = new DummyObject();
		dummyObject1.setDummyStr("ram1");
		
		DummyObject dummyObject2 = new DummyObject();
		dummyObject2.setDummyStr("ram2");
		list.add(dummyObject1);
		list.add(dummyObject2);
		
		
	}
	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public Integer getField2() {
		return field2;
	}
	public void setField2(Integer field2) {
		this.field2 = field2;
	}

	public Vector<DummyObject> getElements() {
		return elements;
	}

	public void setElements(Vector<DummyObject> elements) {
		this.elements = elements;
	}

	public List<DummyObject> getList() {
		return list;
	}

	public void setList(List<DummyObject> list) {
		this.list = list;
	}
}
