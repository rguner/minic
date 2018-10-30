package performance;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Future {

    public static void main(String[] args) throws Exception {
        FutureTask<String> future = new FutureTask<>(
                new Callable<String>() {
                    @Override
                    public String call() throws InterruptedException {
                        return "foo";
                    }
                });
        future.run();
        String get = future.get(30, TimeUnit.SECONDS);
        System.out.println("get = " + get);
    }
}