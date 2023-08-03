import java.util.HashMap;
import java.util.Map;

public class Brain {
  
  private Map<String, String> memory;

  public Brain(){
    memory = new HashMap<>();
  }

  public void processSensoryInput(String input){
    System.out.println("Processing sensory input "+ input);
    StoreMemory(input);
  }

  private void StoreMemory(String input){
    memory.put("LastSensoryInput", input);
  }

  public void processMotorOutput(String action){
    System.out.println("Processing motor output: " + action);
  }

  public void processEmotion(String emotion){
    System.out.println("Processing emotion: "+ emotion);
  }

  public String generateMotorOutput() {
    // Simulate the generation of motor output by the brain based on sensory input
    // In this example, we'll use a simple logic to determine motor output based on
    // the last sensory input stored in memory.
    String lastSensoryInput = memory.get("LastSensoryInput");
    String motorOutput = "No action";

    if (lastSensoryInput != null) {
        if (lastSensoryInput.equalsIgnoreCase("touch")) {
            motorOutput = "Move hand";
        } else if (lastSensoryInput.equalsIgnoreCase("sound")) {
            motorOutput = "Turn head";
        } else {
            motorOutput = "No action";
        }
    }

    return motorOutput;
}
}
