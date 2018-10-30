import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;

public class DateUtils {

	private static ObjectPool<DatatypeFactory> pool;

	static {
		pool = new GenericObjectPool<DatatypeFactory>(new DatatypeFactoryPooledObject());
	}

	public static XMLGregorianCalendar convertDateToGregorian(Date date) {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);

		DatatypeFactory datatypeFactory = borrowDataTypeFactoryFromPool();
		XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		try {
			pool.returnObject(datatypeFactory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return xmlGregorianCalendar;
	}

	public static int getNumActive() {
		return pool.getNumActive();
	}

	private static DatatypeFactory borrowDataTypeFactoryFromPool() {
		DatatypeFactory datatypeFactory = null;
		try {
			datatypeFactory = pool.borrowObject();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // DatatypeFactory.newInstance();
		return datatypeFactory;
	}

}
