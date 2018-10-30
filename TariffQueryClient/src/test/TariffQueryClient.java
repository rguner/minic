package test;

import com.turkcelltech.tariffapi.data.beans.CustomerTariff;
import com.turkcelltech.tariffapi.service.ejb.TariffQueryRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * @author TCRGUNER
 */
public class TariffQueryClient {

	TariffQueryRemote ejb3Lab;

	public static void main(String[] args)
	{
		TariffQueryClient e=new TariffQueryClient();
		e.testOperation();
		System.out.println("----------------------------------------------------------------------------");
	}

	public void setUp() {
		try
		{
			ejb3Lab=(TariffQueryRemote) getInitialContext().lookup("TariffQuery#com.turkcelltech.tariffapi.service.ejb.TariffQueryRemote");
		} catch (NamingException e)
		{
			e.printStackTrace();
		}
		System.out.println("EJB3Lab alindi");
		;
	}

	public void testOperation()
	{
		setUp();
		try {
			// List<OptionalService> optionalServiceList=ejb3Lab.findTariffOptionsByChnOprId("434", 44);
			// System.out.println("EJB3 Operation result=" + optionalServiceList);
			CustomerTariff ct=ejb3Lab.getCustomerTariff(0, "5322100234", 0);
			System.out.println("EJB3 Operation result=" + ct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected final static Context getInitialContext()
	{
		try
		{
			Context ctx=null; // Get an InitialContext
			Properties h=new Properties();
			h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			h.put(Context.PROVIDER_URL, "t3://10.201.232.95:30031");
			ctx=new InitialContext(h);
			return ctx;
		} catch (NamingException ne)
		{
			ne.printStackTrace();
			return null;
		}
	}
}
