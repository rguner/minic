package singleton;

public class EagerlySingleton {

    // instance is created at class loading time
    private static final EagerlySingleton instance = new EagerlySingleton();

    // private constructor prevents instantiation from other classes
    private EagerlySingleton() {}

    // global access point
    public static EagerlySingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }

}
