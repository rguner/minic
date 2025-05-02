package singleton;

public class EnumSingletonUsage {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.showMessage();
    }
}
