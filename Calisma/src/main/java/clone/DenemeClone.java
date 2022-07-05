package clone;

import java.util.Objects;

public class DenemeClone implements Cloneable {

    private String ad;
    private String soyad;
    private int no;

    public static void main(String[] args) {
        DenemeClone denemeClone = new DenemeClone();
        denemeClone.ad = "remazan";
        denemeClone.soyad = "guner";
        denemeClone.no = 1300;
        System.out.println(denemeClone + " " + denemeClone.log() + " " + denemeClone.hashCode());
        try {
            DenemeClone denemeClone2 = (DenemeClone) denemeClone.clone();
            System.out.println(denemeClone2 + " " + denemeClone2.log() + " " + denemeClone2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DenemeClone that = (DenemeClone) o;
        return no == that.no && Objects.equals(ad, that.ad) && Objects.equals(soyad, that.soyad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ad, soyad, no);
    }

     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String log() {
        return "DenemeClone{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", no=" + no +
                '}';
    }
}

