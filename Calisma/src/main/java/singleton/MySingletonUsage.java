package singleton;

public class MySingletonUsage {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.showMessage();
    }
}
