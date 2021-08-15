package com.javatpoint;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    // YOMTEN1 YOMTEN2 YOMTEN3
    //@Async("managedExecutorService")
    //@Async

    // YOMTEN4
    @Async("threadPoolTaskExecutor")
    public String asyncMethod() {

        try {
            System.out.println("Async Thread started process: " + Thread.currentThread().toString() );
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Async Thread finished process : " + Thread.currentThread().toString());
        return "Ramazan";
    }
}
