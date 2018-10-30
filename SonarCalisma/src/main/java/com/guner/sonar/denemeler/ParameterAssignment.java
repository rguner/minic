package com.guner.sonar.denemeler;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParameterAssignment {
	
	public static final String DATE_FORMAT="dd-MM-yyyy";

	public static void main(String[] args) {
		ParameterAssignment parameterAssignment = new ParameterAssignment();
		parameterAssignment.execute();
	}

	private void execute() {
		
		Date date1=new Date();
		Date date2=new Date();
		
		int sonuc=compareDates1(date1, date2);
		System.out.println(date1 + " " + date2 + " " +  sonuc);
		
		sonuc=compareDates2(date1, date2);
		System.out.println(date1 + " " + date2 + " " +  sonuc);

	}

	public static int compareDates1(Date date1, Date date2) {

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

		try {
			date1 = sdf.parse(sdf.format(date1));
			sdf.parse(sdf.format(date2));
			System.out.println(date1 + " " + date2);
		} catch (Exception e) {

			System.out.println("hataa");
		}

		return date1.compareTo(date2);
	}
	
	public static int compareDates2(Date date1, Date date2) {

		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

		try {
			Date date3 = sdf.parse(sdf.format(date1));
			Date date4 = sdf.parse(sdf.format(date2));
			System.out.println(date3 + " " + date4);
		} catch (Exception e) {

			System.out.println("hataa");
		}

		return date1.compareTo(date2);
	}

}
