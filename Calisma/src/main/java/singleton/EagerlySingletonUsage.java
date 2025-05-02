package singleton;

public class EagerlySingletonUsage {
    public static void main(String[] args) {
        EagerlySingleton eagerlySingleton = EagerlySingleton.getInstance();
        eagerlySingleton.showMessage();
    }
}
