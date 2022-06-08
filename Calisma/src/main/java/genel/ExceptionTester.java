package genel;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;


public class ExceptionTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTester et= new ExceptionTester();
		try {
			et.calis();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	
	public void calis() throws Exception
	{
		try {
			calis1();
		} catch (Exception e) {
			//e.printStackTrace();
			//print(e);
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			pw.close();
			String stackTrace = sw.toString();
			System.out.println("Selam\n" + stackTrace);
		}
		
		
	}

	public void calis1() throws Exception
	{
		try {
			calis2();
		} catch (Exception e) {
			throw new Exception("Hata1",e);			
		}
		
		
	}
	
	private void print(Exception e) 
	{
		printStackTrace(e);
	}

	public void calis2() throws Exception
	{
		try {
			calis3();
		} catch (Exception e) {
			throw new Exception("Hata2",e);
		}
		
		
	}
	
	public void calis3() throws Exception
	{
		throw new Exception("Hata3");
		
	}
	
	public void printStackTrace(Throwable e) 
	{
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            StackTraceElement[] trace = e.getStackTrace();
            for (int i=0; i < trace.length; i++)
            	System.out.println("\tat " + trace[i]);

            Throwable cause = getCause(e);
            if (cause != null)
                printStackTraceAsCause(cause,e.getStackTrace());
    }
	
	 private void printStackTraceAsCause(Throwable cause,StackTraceElement[] causedTrace)
	{
		// assert Thread.holdsLock(s);
		
		// Compute number of frames in common between this and caused
		
		StackTraceElement[] trace = cause.getStackTrace();
		int m = trace.length-1, n = causedTrace.length-1;
		while (m >= 0 && n >=0 && trace[m].equals(causedTrace[n])) {
		m--; n--;
		}
		int framesInCommon = trace.length - 1 - m;
		
		
		System.out.println("Caused by: " + cause.getClass().getName() + ": " + cause.getMessage());
		for (int i=0; i <= m; i++)
			System.out.println("\tat " + trace[i]);
		if (framesInCommon != 0)
			System.out.println("\t... " + framesInCommon + " more");
		
		// Recurse if we have a cause
		Throwable ourCause = getCause(cause);
		if (ourCause != null)
			printStackTraceAsCause(ourCause,cause.getStackTrace());
	}
	 
	 private Throwable getCause(Throwable cause)
	 {
		 Throwable ourCause = cause.getCause();
		 return (ourCause==cause ? null : ourCause);
	 }

}
