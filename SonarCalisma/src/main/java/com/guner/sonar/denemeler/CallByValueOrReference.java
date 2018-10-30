package com.guner.sonar.denemeler;

import java.util.ArrayList;
import java.util.List;

public class CallByValueOrReference {

	
	public static void main(String[] args) {
		
		CallByValueOrReference callByValueOrReference = new CallByValueOrReference();
		callByValueOrReference.yontem();

	}

	private void yontem() {
		
		Model model = new Model();
		model.setAd("Ramazan");
		model.setNo(20);
		Integer in = new Integer(50);		
		String s="s";
		
		System.out.println("Yontem     --> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);
		yontemCall(model, in, s);
		System.out.println("Yontem     --> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);
		
		
		model.setAd("Ramazan");
		model.setNo(20);		
		in = new Integer(50);		
		s="s";
		
		System.out.println("Yontem     --> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);
		yontemCall2(model, in, s);
		System.out.println("Yontem     --> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);
		
		
		List<Model> list = null;
		list = new ArrayList<Model>();
        Model m= new Model();
        m.setAd("Omer1");
        m.setNo(101);
        list.add(m);
		List<Model> returnedList=listCall(list);
		System.out.println("listCall  Main      --> " + list.get(0).getAd() + " " + list.get(0).getNo());
		System.out.println("listCall  Returned  --> " + returnedList.get(0).getAd() + " " + returnedList.get(0).getNo());
		
		
		int i=0;
		long l=0;
		System.out.println("Yontem     --> " + i + " " + l);
		primitiveYontemCall(i, l);
		System.out.println("Yontem     --> " + i + " " + l);
		
	}
	
	private void yontemCall(Model model, Integer in, String s) {
		
		model.setAd("Omer");
		model.setNo(21);
		in=51;
		s="t";
		//s=s+"t"; bu da aynı durumda, assignment var çünkü.		
		
		System.out.println("YontemCall --> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);		
	
	}
	
	private void yontemCall2(Model model, Integer in, String s) {
		
		model= new Model();
		model.setAd("Sevval");
		model.setNo(22);
		in=51;
		s="t";
		
		System.out.println("YontemCall2--> " + model.getAd() + " " + model.getNo() + " " + in + " " + s);
	}
	
	public List<Model> listCall(List<Model> list) {        
		list = new ArrayList<Model>();
        Model m= new Model();
        m.setAd("Omer2");
        m.setNo(102);
        list.add(m);
        return list;
    }
	
	private void primitiveYontemCall(int i, long l) {		
		i=2222;
		l=9999;
		System.out.println("primitiveYontemCall --> "+  i + " " + l);		
	
	}

}
