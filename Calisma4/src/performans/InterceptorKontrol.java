package performans;

import java.util.Arrays;
import java.util.stream.Stream;

public class InterceptorKontrol {


    public static final String restrictedList = "10.10.10.10,20.20.20.20,30.30.30.30,40.40.40.40,50.50.50.50,60.60.60.60,70.70.70.70,80.80.80.80,90.90.90.90";
    public static final String ipAddres1 = "50.50.50.50";
    public static final String ipAddres1_eksik = "0.50.50.5";
    public static final String ipAddres2 = "61.61.61.61";
    public static final String ipAddres2_eksik = "1.61.61.6";
    public static final Integer COUNT = 900000;

    public static void main(String[] args) {
        InterceptorKontrol ic = new InterceptorKontrol();
        ic.yontem1();
        ic.yontem2();
        ic.yontem3();
        ic.yontem4();
        ic.yontem5();
    }

    private void yontem1() {

        int restrictedCount = 0;
        int unRestrictedCount = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            Stream<String> restrictedStream = Stream.of(restrictedList.split(","));
            if (restrictedStream.anyMatch(s -> s.equalsIgnoreCase(ipAddres1))) {
                restrictedCount++;
            }

            Stream<String> unRestrictedStream = Stream.of(restrictedList.split(","));
            if (unRestrictedStream.anyMatch(s -> s.equalsIgnoreCase(ipAddres2))) {

            } else {
                unRestrictedCount++;
            }
        }

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start));
    }

    private void yontem2() {

        int restrictedCount = 0;
        int unRestrictedCount = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            if (restrictedList.contains(ipAddres1)) {
                restrictedCount++;
            }

            if (restrictedList.contains(ipAddres2)) {
            } else {
                unRestrictedCount++;
            }
        }

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start));
    }

    private void yontem3() {

        int restrictedCount = 0;
        int unRestrictedCount = 0;
        long start = System.currentTimeMillis();


        for (int i = 0; i < COUNT; i++) {
            String[] splittedList = restrictedList.split(",");
            for (int j = 0; j < splittedList.length; j++) {
                if (ipAddres1.equalsIgnoreCase(splittedList[j])) {
                    restrictedCount++;
                    break;
                }
            }
        }

        for (int i = 0; i < COUNT; i++) {
            String[] splittedList = restrictedList.split(",");
            for (int j = 0; j < splittedList.length; j++) {
                if (ipAddres2.equalsIgnoreCase(splittedList[j])) {
                    break;
                }
            }
            unRestrictedCount++;
        }

        System.out.println("SONUC: "+restrictedCount +" "+unRestrictedCount +" süre: "+(System.currentTimeMillis()-start));
    }

    private void yontem4() {

        int restrictedCount = 0;
        int unRestrictedCount = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            if (Arrays.stream(restrictedList.split(",")).anyMatch(s -> s.equalsIgnoreCase(ipAddres1))) {
                restrictedCount++;
            }

            Stream<String> unRestrictedStream = Stream.of(restrictedList.split(","));
            if (Arrays.stream(restrictedList.split(",")).anyMatch(s -> s.equalsIgnoreCase(ipAddres2))) {

            } else {
                unRestrictedCount++;
            }
        }

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start));
    }

    private void yontem5() {

        int restrictedCount = 0;
        int unRestrictedCount = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            if (restrictedList.contains('5'+ipAddres1_eksik+'0')) {
                restrictedCount++;
            }

            if (restrictedList.contains('6'+ipAddres2_eksik+'1')) {
            } else {
                unRestrictedCount++;
            }
        }

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start));
    }



}
