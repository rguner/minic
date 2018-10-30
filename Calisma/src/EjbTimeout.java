import java.rmi.RemoteException;
import java.util.Properties;

import javax.ejb.EJBHome;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tools.ant.types.PatternSet.NameEntry;

import weblogic.jndi.WLContext;

import com.turkcell.toska.ejb.ProductUtilOperations;
import com.turkcell.toska.exception.ToskaException;


public class EjbTimeout 
{
	
   public static void main(String[] args) 
   {
	   EjbTimeout ejbTimeout = new EjbTimeout();
	   ejbTimeout.calEjb();
	
   }
	
	private void calEjb() 
	{		
		System.out.println("Islem basladi");
		ProductUtilOperations puo = (ProductUtilOperations) getEJB("ProductUtilOperationsEJB");
		try 
		{
			int productId = puo.msisdn2ProductId("5326215050");
			System.out.println("Islem bitti "  + productId);
		} catch (RemoteException | ToskaException e) 
		{
			System.out.println("hata olustu");
			e.printStackTrace();
		}
	
	}

	protected final static Context getInitialContext() {
		try {
			Context ctx = null; // Get an InitialContext
			Properties h = new Properties();
			h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			h.put(Context.PROVIDER_URL, "t3://localhost:7001");
			h.put(WLContext.CONNECT_TIMEOUT, 10000L); // h.put("weblogic.jndi.connectTimeout", 1500L); 
			h.put(WLContext.RESPONSE_READ_TIMEOUT, 10000L); // h.put("weblogic.jndi.responseReadTimeout", 1500L);
			//h.put(WLContext.RMI_TIMEOUT, new Long(1500));
			ctx = new InitialContext(h);
			return ctx;
		} catch (NamingException ne) {
			ne.printStackTrace();
		}
		return null;
	}
	
		public static synchronized Object getEJB(String jndiName) {
			try {
				EJBHome home = (EJBHome) getInitialContext().lookup(jndiName);
				java.lang.reflect.Method m = home.getClass().getMethod("create", null);
				Object obj = m.invoke(home, null);
				return obj;
			} catch (Exception namEx) {
				namEx.printStackTrace();
			}
			return null;
		}
	 

}
