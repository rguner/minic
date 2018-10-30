package com.example;

public class Merhaba implements MerhabaMBean {

	private String field = "MerhabaAttribute";

	// getter olmazsa attribute listesinde gözükmez
	public String getField() {
		return field;
	}

	/*
	 * setter olursa yani void donerse operasyon olarak gozukmez public void setField(String field) { this.field = field; } setter olursa yani void donerse,
	 * jvisualvm'de attributes alanindan edit edilebilir
	 */

	/*
	 * void donerse operasyon olarak gozukmez
	 */
	public String setField(String field) {
		this.field = field;
		return this.field;
	}

	@Override
	public void merhaba() {
		System.out.println("Merhaba.....");

	}

}
