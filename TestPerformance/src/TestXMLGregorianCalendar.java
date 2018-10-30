import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import java.util.Calendar;
import java.util.Date;

public class TestXMLGregorianCalendar {

	// private static final String DATE_STR = "1980-12-10T22:02:03";
	private static final String DATE_STR = "1961-04-23+02:00";

	public static void main(String[] args) throws Exception {

		TestXMLGregorianCalendar testXMLGregorianCalendar = new TestXMLGregorianCalendar();

		XMLGregorianCalendar c;
		DatatypeFactory f;
		try {
			f = DatatypeFactory.newInstance();
			c = f.newXMLGregorianCalendar(DATE_STR);
			gregorianYontemi(c, true);
			calendarOlusturmaYontemi(c, true);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		testXMLGregorianCalendar.execute();

	}

	private static final int COUNT = 9999999;

	private void execute() {
		GregorianThread gregorianThread = new GregorianThread();
		gregorianThread.start();

		CalendarThread calendarThread = new CalendarThread();
		calendarThread.start();

	}

	public class GregorianThread extends Thread {

		XMLGregorianCalendar c;

		public GregorianThread() {
			this.setName("Gregorian-Thread");
			DatatypeFactory f;
			try {
				f = DatatypeFactory.newInstance();
				c = f.newXMLGregorianCalendar(DATE_STR);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 0; i < COUNT; i++) {
				gregorianYontemi(c);
			}
			System.out.println("GregorianThread bitti. " + (System.currentTimeMillis() - start));

		}

	}

	public class CalendarThread extends Thread {

		XMLGregorianCalendar c;

		public CalendarThread() {
			this.setName("Calendar-Thread");
			DatatypeFactory f;
			try {
				f = DatatypeFactory.newInstance();
				c = f.newXMLGregorianCalendar(DATE_STR);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 0; i < COUNT; i++) {
				calendarOlusturmaYontemi(c);
			}
			System.out.println("CalendarThread bitti. " + (System.currentTimeMillis() - start));

		}

	}

	private static void calendarOlusturmaYontemi(XMLGregorianCalendar c) {
		calendarOlusturmaYontemi(c, false);
	}

	private static void gregorianYontemi(XMLGregorianCalendar c) {
		gregorianYontemi(c, false);
	}

	private static void calendarOlusturmaYontemi(XMLGregorianCalendar c, boolean isPrint) {
		Calendar cal = Calendar.getInstance();

		// cal.set(c.getYear(), c.getMonth() - 1, c.getDay(), c.getHour(), c.getMinute(), c.getSecond());
		QName qName = c.getXMLSchemaType();

		// System.out.println(c.toString() + " " + c.toXMLFormat() + " " + c.getXMLSchemaType() + " " + c.normalize()
		// + " " + c.isValid() + " " + c.getHour() + " " + c.getMinute()
		// + " " + c.getSecond());
		if (qName.getLocalPart().equalsIgnoreCase("date")) {
			cal.set(c.getYear(), c.getMonth() - 1, c.getDay(), 0, 0, 0);
		} else {
			cal.set(c.getYear(), c.getMonth() - 1, c.getDay(), c.getHour(), c.getMinute(), c.getSecond());
		}
		// cal.setTimeZone(c.getTimeZone(0));
		Date d = cal.getTime();
		if (isPrint)
			System.out.println("calendar Date: " + d);
	}

	private static void gregorianYontemi(XMLGregorianCalendar c, boolean isPrint) {
		Date d = c.toGregorianCalendar().getTime();
		if (isPrint)
			System.out.println("gregorianDate: " + d);
	}
}
