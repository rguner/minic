import java.util.ArrayList;
import java.util.List;


public class NullCalisma {

    public static void main(String[] args) {
        NullCalisma nullCalisma = new NullCalisma();
        nullCalisma.execute();
        nullCalisma.execute2();
        nullCalisma.execute3();
        nullCalisma.execute4();
    }

    private void execute() {
        List<Object> values = new ArrayList<>();

        //values=null;
        for (Object object : values) {
            System.out.println("deneme");
        }

    }

    private void execute2() {
        try {
            throw new NullPointerException("null oluştu");
        } catch (Exception e) {
            System.out.println("Exception oluştu" + e);
        }
    }

    private void execute3() {

        Object o = new String("ramazan");
        String s= (String)o;
        System.out.println(s);

        Object o2 = null;
        String s2= (String)o2;
        System.out.println(s2);
    }

    private void execute4() {
        //Clonable c3 = new Clonable();
        Clonable c3 = null;
        try {
            c3.clone();
            System.out.println("cloned");
        }catch (Exception e) {
            System.out.println("clone exception");
            e.printStackTrace();
        }
    }
}
