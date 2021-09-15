import java.util.ArrayList;
import java.util.List;


public class NullCalisma {

    public static void main(String[] args) {
        NullCalisma nullCalisma = new NullCalisma();
        nullCalisma.execute();
        nullCalisma.execute2();
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
}
