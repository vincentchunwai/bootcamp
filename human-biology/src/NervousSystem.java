public class NervousSystem {
  
  private Brain brain;
  private SpinalCord spinalCord;
  private PeripheralNerves peripheralNerves;

  public NervousSystem(){
    brain = new Brain();
    spinalCord = new SpinalCord();
    peripheralNerves = new PeripheralNerves();
  }

  public void processSensoryInput(String input) {
    // Simulate processing of sensory input by the nervous system
    // Here, the sensory input is transmitted to the brain through the spinal cord
    // and then the brain processes the input and generates motor output.
    System.out.println("Sensory input received: " + input);
    spinalCord.transmitSensorySignal(input);
    brain.processSensoryInput(input);
    generateMotorOutput();
}

private void generateMotorOutput() {
    String motorOutput = brain.generateMotorOutput();
    spinalCord.transmitMotorSignal(motorOutput);
}

public void enableReflexes() {
    spinalCord.enableReflexes();
}

public void disableReflexes() {
    spinalCord.disableReflexes();
}
}
