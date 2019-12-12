package Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StartCounter {
   
   // Starts the threads. Pool size 2 means at any time
   // there can only be two simultaneous threads
   public void startThread() {
      ExecutorService taskList = Executors.newFixedThreadPool(2);
      for (int i = 0; i < 5; i ++) {
         // Makes tasks available for execution.
         // At the appropriate time, calls run method of runnable interface
         taskList.execute(new Counter(this, i+1, "task " + (i+1)));
      }
      // Shuts the thread that's watching to see if you have added new tasks.
      taskList.shutdown();
   }

   // Pauses execution for a moment so that system switches back and forth
   public void pause(double seconds) {
      try {
         Thread.sleep(Math.round(1000.0 * seconds));
      } catch(InterruptedException e) {
         e.printStackTrace();
      }
   }
   
}