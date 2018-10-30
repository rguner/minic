package javadigest.spring.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyTask {

  @Async
  public void execute() {
    System.out.println("Executing asynchronous task.");
  }
  
  @Async
  public void execute2() {
    System.out.println("Executing asynchronous task2.");
  }

public void executeNotAsyncJob() {
	System.out.println("Executing executeNotAsyncJob task.");

}
}