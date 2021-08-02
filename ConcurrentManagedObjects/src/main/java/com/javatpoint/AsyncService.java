package com.javatpoint;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async("managedExecutorService")
    public String asyncMethod() {

        try {
            System.out.println("Async Thread started process: " + Thread.currentThread().getName() );
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Async Thread finished process : " + Thread.currentThread().getName() );
        return "Ramazan";
    }
}
