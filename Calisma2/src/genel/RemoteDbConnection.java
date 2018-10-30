package genel;

import java.sql.Connection;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class RemoteDbConnection {
	public static void main(String[] args) 
	{
		RemoteDbConnection remoteDbConnection = new RemoteDbConnection();
		remoteDbConnection.getConn();
	}

	private void getConn() {

		try {
			Connection conn=getConnection("RSEPETI-DS", "a1");
			System.out.println("conn alindi" + conn); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private final Connection getConnection(String dsName, String connLogUniqueId)
            throws Exception {
      try 
      {
            return ((DataSource) (getInitialContext().lookup(dsName)))
                       .getConnection();
      } catch (Exception e) 
      {
            String msg = "Error in getting connection DSName:" + dsName
                       + ",url:" + ", uid:" + connLogUniqueId + 
                       e.getMessage() + "," + e.getCause();
            throw new Exception(msg);
      }
}

	
	
	protected final static Context getInitialContext() 
	{
		try 
		{
			Context ctx = null; // Get an InitialContext
			Properties h = new Properties();
			h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
			h.put(Context.PROVIDER_URL, "t3://10.210.154.58:8022");
			ctx = new InitialContext(h);
			return ctx;
		} 
		catch (NamingException ne) 
		{
			ne.printStackTrace();
			return null;
		}
	}


}
