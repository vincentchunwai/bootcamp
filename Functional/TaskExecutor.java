public class TaskExecutor {
  
  void executeTask(Callback callback){

    String message = "task completed";

    callback.onComplete(message);
  }
}
