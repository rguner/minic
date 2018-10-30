import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestJaxp {

	private static final int COUNT = 99999999;

	public static void main(String[] args) throws Exception {

		TestJaxp textJaxp = new TestJaxp();

		// textJaxp.execute();
		// textJaxp.execute2();
		// textJaxp.execute3();
		textJaxp.execute4();

	}

	private void execute4() {
		DatatypeFactoryThread datatypeFactoryThread = new DatatypeFactoryThread();
		datatypeFactoryThread.start();
		DatatypeFactoryThread datatypeFactoryThread2 = new DatatypeFactoryThread();
		datatypeFactoryThread2.start();
		DatatypeFactoryThread datatypeFactoryThread3 = new DatatypeFactoryThread();
		datatypeFactoryThread3.start();
		DatatypeFactoryThread datatypeFactoryThread4 = new DatatypeFactoryThread();
		datatypeFactoryThread4.start();

	}

	private void execute3() {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			Date date = new Date();
			XMLGregorianCalendar xmlGregorianCalendar = DateUtils.convertDateToGregorian(date);
			// System.out.println(xmlGregorianCalendar);
			if ((i % 10000) == 0) {
				System.out.println("Sayı " + i + " Sure " + (System.currentTimeMillis() - t1)
						+ " pool size " + DateUtils.getNumActive());
			}

		}
	}

	private void execute() {

		long t1 = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			Date date = new Date();
			XMLGregorianCalendar xmlGregorianCalendar = convertDateToGregorian(date);
			// System.out.println(xmlGregorianCalendar);
			if ((i % 10000) == 0) {
				System.out.println("Sayı " + i + " Sure " + (System.currentTimeMillis() - t1));
			}

		}
	}

	private void execute2() {

		long t1 = System.currentTimeMillis();
		DatatypeFactory datatypeFactory = null;
		try {
			datatypeFactory = DatatypeFactory.newInstance();
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			System.err.println("Hataaa" + e);
			e.printStackTrace();
		}
		for (int i = 0; i < COUNT; i++) {
			Date date = new Date();
			XMLGregorianCalendar xmlGregorianCalendar = convertDateToGregorianWithDTF(date, datatypeFactory);
			// System.out.println(xmlGregorianCalendar);
			if ((i % 10000) == 0) {
				System.out.println("Sayı " + i + " Sure " + (System.currentTimeMillis() - t1));
			}

		}
	}

	public static XMLGregorianCalendar convertDateToGregorian(Date date) {

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		XMLGregorianCalendar xmlGregorianCalendar = null;

		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			System.err.println("Hataaa" + e);
			e.printStackTrace();
		}

		return xmlGregorianCalendar;
	}

	public static XMLGregorianCalendar convertDateToGregorianWithDTF(Date date, DatatypeFactory datatypeFactory) {

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		XMLGregorianCalendar xmlGregorianCalendar = null;

		xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

		return xmlGregorianCalendar;
	}

	public class DatatypeFactoryThread extends Thread {

		XMLGregorianCalendar c;

		public DatatypeFactoryThread() {
			this.setName("DatatypeFactory-Thread");

		}

		public void run() {
			long t1 = System.currentTimeMillis();
			for (int i = 0; i < COUNT; i++) {
				Date date = new Date();
				XMLGregorianCalendar xmlGregorianCalendar = DateUtils.convertDateToGregorian(date);
				if ((i % 10000) == 0) {
					System.out.println("Sayı " + i + " Sure " + (System.currentTimeMillis() - t1)
							+ " pool size " + DateUtils.getNumActive());
				}
			}
			System.out.println("DatatypeFactoryThread bitti. " + (System.currentTimeMillis() - t1));

		}

	}
}
