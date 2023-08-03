public class Heart extends Organ {
    private double HeartRate;
    private boolean isBeating;
    
    public Heart(String name, String function, double HeartRate) {
      super(name, function);
      this.HeartRate = HeartRate;
      this.isBeating = false;
    }

    public double getHeartRate(){
      return HeartRate;
    }

    public boolean isBeating(){
      return isBeating;
    }

    public void startBeating(){
      isBeating = true;
      System.out.println("Heart starts beating at a rate of " + HeartRate + " beats per minute.");
    }

    public void stopsBeating(){
      isBeating = false;
      System.out.println("Heart stops beating.");
    }

    public void pump(){
      if(isBeating = true)
      System.out.println("Heart is pumping blood");
      else
      System.out.println("Heart stops beating. Blood not pumped");
    }

    public double getOxygenRequirement(){
      return HeartRate * 0.1;
    }

    public double getNutrientRequirement(){
      return HeartRate * 0.05;
    }

    



  }
