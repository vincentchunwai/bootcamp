public class Kidney extends Organ {
    private double filtrationRate;
    private double wasteProduction;

    public Kidney(String name, String function, double filtrationRate,
        double wasteProduction) {
      super(name, function);
      this.filtrationRate = filtrationRate;
      this.wasteProduction = wasteProduction;
    }

    public double getFiltrationRate(){
      return this.filtrationRate;
    }

    public double getWasteProduction(){
      return this.wasteProduction;
    }

    public void filter(){
      double filteredAmount = filtrationRate/60;
      wasteProduction += filteredAmount;
      System.out.println("Kidney filtering blood. Waste products accumulated: " + wasteProduction + " ml");
    }

    public void excreteUrine(){
      double urineAmount = wasteProduction;
      wasteProduction = 0.0;
      System.out.println("Kidney excreting urine. Urine amount: " + urineAmount + " ml");
    }


  }
