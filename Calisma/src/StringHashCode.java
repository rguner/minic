import java.util.Arrays;
import java.util.List;

public class StringHashCode {

    public static void main(String[] args) {

        String str = new String("Welcome to Tutorialspoint.com");
        long t = System.currentTimeMillis();
        System.out.println("Hashcode for Str :" + str.hashCode() + " Süre:" + (System.currentTimeMillis() - t));

        String str2 = new String("Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12");
        t = System.currentTimeMillis();
        System.out.println("Hashcode for Str :" + str2.hashCode() + " Süre:" + (System.currentTimeMillis() - t));

        String str3 = new String("Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com123");
        t = System.currentTimeMillis();
        System.out.println("Hashcode for Str :" + str3.hashCode() + " Süre:" + (System.currentTimeMillis() - t));

        String str4 = new String("Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com12Welcome to Tutorialspoint.com1234");
        str4 = str4 + str4;
        str4 = str4 + str4;
        str4 = str4 + str4;
        t = System.currentTimeMillis();
        System.out.println("Hashcode for Str :" + str4.hashCode() + " Süre:" + (System.currentTimeMillis() - t));

        List<String> enableCategories = Arrays.asList("34".split(","));
        System.out.println(enableCategories);

    }


}
