package genel;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Quick demo of RE substitution: correct "demon" and other
 * spelling variants to the correct, non-satanic "daemon".
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: ReplaceDemo.java,v 1.5 2004/02/09 03:33:42 ian Exp $
 */
public class ReplaceDemo {
  public static void main(String[] argv) {

    // Make an RE pattern to match almost any form (deamon, demon, etc.).
    String patt = "d[ae]{1,2}mon";  // i.e., 1 or 2 'a' or 'e' any combo

    // A test input.
    String input = "Unix hath demons and deamons in it!";
    System.out.println("Input: " + input);

    // Run it from a RE instance and see that it works
    Pattern r = Pattern.compile(patt);
    Matcher m = r.matcher(input);
    System.out.println("ReplaceAll: " + m.replaceAll("daemon"));

    // Show the appendReplacement method
    m.reset();
    StringBuffer sb = new StringBuffer();
    System.out.print("Append methods: ");
    while (m.find()) {
      m.appendReplacement(sb, "daemon");  // Copy to before first match,
                        // plus the word "daemon"
    }
    m.appendTail(sb);            // copy remainder
    System.out.println(sb.toString());
    
    List l=new ArrayList();
    l.add("1Rqamazan");
    l.add("Ceyhan");
    l.add(3,"selam");
    //List list = Collections.synchronizedList(l);
    //Collections.sort(list);
    //for(int i=0;i<list.size();i++)
    //	System.out.println(list.get(i));
    if (l.get(4)==null)
    	System.out.println("4 null");
    
    
    

    
    
    //l.set(2,new String("selam0"));
    
    
    
  }
}