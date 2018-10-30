import java.util.Calendar;


public class Calcalisma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0); 
        cal.clear(Calendar.MINUTE);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MILLISECOND);
        
        System.out.println(cal);
        System.out.println(cal.getTime());
        
        
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(java.util.Calendar.DAY_OF_MONTH));
        
        System.out.println(cal.getTime());


	}

}
