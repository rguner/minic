package singleton;

public class MySingleton {

    // volatile ensures changes to instance are visible to all threads
    private static volatile MySingleton instance;

    // private constructor prevents instantiation from outside
    private MySingleton() {}

    // global access point
    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    // example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
