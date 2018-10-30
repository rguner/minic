package performance;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.turkcell.singlehub.utils.pool.PoolUtils;
/**
 * pool size default
 * 10 thread Sayı 10000 Sure 16424 pool size:8 pool idle size:0
 * 20 thread Sayı 10000 Sure 30362 pool size:8 pool idle size:0
 * 
 * pool size 20
 * 20 thread Sayı 10000 Sure 13516 pool size:19 pool idle size:1
 * 50 thread Sayı 10000 Sure 30000 pool size:20 pool idle size:0
 * 
 * 
 * pool size 50
 * 50 thread Sayı 10000 Sure 13045 pool size:49 pool idle size:1
 * 100 threadSayı 10000 Sure 21939 pool size:50 pool idle size:0 
 */

public class PoolUtilsUser {

	private static final int COUNT = 99999999;

	public static void main(String[] args) throws Exception {

		PoolUtilsUser poolUtilsUser = new PoolUtilsUser();
		poolUtilsUser.execute();

	}

	private void execute() {
		for (int i=0;i<2;i++) {
			PoolUtilsThread poolUtilsThread = new PoolUtilsThread("-"+i);
			poolUtilsThread.start();
		}
		

	}


	public class PoolUtilsThread extends Thread {

		XMLGregorianCalendar c;

		public PoolUtilsThread(String name) {
			this.setName("PoolUtilsThread-Thread"+name);

		}

		public void run() {
			long tMainStart=System.currentTimeMillis();
			long tStart=System.currentTimeMillis();
			for (int i = 0; i < COUNT; i++) {
				DatatypeFactory datatypeFactory = PoolUtils.borrowDataTypeFactoryFromPool();
				//datatypeFactory.newDuration(100);
				org.apache.commons.pool2.ObjectPool<DatatypeFactory> pool = PoolUtils.getDatatypeFactoryObjectPool();
				
				try {
					Thread.currentThread().sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					pool.returnObject(datatypeFactory);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if ((i % 10000) == 0) {
					System.out.println("Sayı " + i + " Sure " + (System.currentTimeMillis() - tStart)
							+ " pool size:" + pool.getNumActive() + " pool idle size:" + pool.getNumIdle());
					tStart=System.currentTimeMillis();
				}
				
		
			}
			System.out.println("PoolUtilsThread bitti. " + (System.currentTimeMillis() - tMainStart));

		}

	}
}
