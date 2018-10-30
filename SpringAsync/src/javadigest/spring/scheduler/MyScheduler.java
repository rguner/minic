package javadigest.spring.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyScheduler {

  @Autowired
  private MyTask task;

  @Scheduled(fixedDelay = 10000)
  public void processScheduledJob() {
    task.execute();
  }
  
  @Scheduled(fixedDelay = 10000)
  public void processScheduledJob2() {
    task.execute2();
  }
  
  @Scheduled(fixedDelay = 10000)
  public void processScheduledAndNotAsyncJob() {
    task.executeNotAsyncJob();
  }

  public MyTask getTask() {
    return task;
  }

  public void setTask(MyTask task) {
    this.task = task;
  }
}