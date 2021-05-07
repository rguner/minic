package performans;

import java.util.stream.Stream;

public class InterceptorKontrol {


    public static final String restrictedList="10.10.10.10,20.20.20.20,30.30.30.30,40.40.40.40,50.50.50.50";
    public static final String ipAddres1="30.30.30.30";
    public static final String ipAddres2="60.60.60.60";
    public static final Integer COUNT=500000;

    public static void main(String[] args) {
        InterceptorKontrol ic= new InterceptorKontrol();
        ic.yontem1();
        ic.yontem2();
    }

    private void yontem1() {

        int restrictedCount=0;
        int unRestrictedCount=0;
        long start=System.currentTimeMillis();
        for (int i=0;i<COUNT;i++) {
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

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start) );
    }

    private void yontem2() {

        int restrictedCount=0;
        int unRestrictedCount=0;
        long start=System.currentTimeMillis();
        for (int i=0;i<COUNT;i++) {
            if (restrictedList.contains(ipAddres1)) {
                restrictedCount++;
            }

            if (restrictedList.contains(ipAddres2)) {
            } else {
                unRestrictedCount++;
            }
        }

        System.out.println("SONUC: " + restrictedCount + " " + unRestrictedCount + " süre: " + (System.currentTimeMillis() - start) );
    }


}
