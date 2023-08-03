
public class Blood {
  private double oxygenLevel;
  private double glucoseLevel;
  private double wasteProductsLevel;
  private double whiteBloodCellCount;

  public Blood() {
    this.oxygenLevel = 100.0;
    this.glucoseLevel = 100.0;
    this.wasteProductsLevel = 0.0;
    this.whiteBloodCellCount = 5000;
  }


  public double getOxygenLevel() {
    return oxygenLevel;
  }

  public void setOxygenLevel(double oxygenLevel) {
    this.oxygenLevel = oxygenLevel;
  }

  public double getGlucoseLevel() {
    return glucoseLevel;
  }

  public void setGlucoseLevel(double glucoseLevel) {
    this.glucoseLevel = glucoseLevel;
  }

  public double getWasteProductsLevel() {
    return wasteProductsLevel;
  }

  public void setWasteProductsLevel(double wasteProductsLevel) {
    this.wasteProductsLevel = wasteProductsLevel;
  }

  public double getWhiteBloodCellCount() {
    return whiteBloodCellCount;
  }

  public void setWhiteBloodCellCount(double whiteBloodCellCount) {
    this.whiteBloodCellCount = whiteBloodCellCount;
  }

  public void deliverHormones() {
    String[] hormones = {"Insulin", "Thyroid hormone", "Estrogen",};
    String[] targetTissues = {"Liver", "Muscle cells", "Uterus",};
    for (int i = 0; i < hormones.length; i++) {
      String hormone = hormones[i];
      String targetTissue = targetTissues[i];
      System.out
          .println(hormone + " is being delivered to " + targetTissue + ".");
    }



  }

  public void pumpBlood(Heart heart) {
    if (heart.getHeartRate() > 0) {
      System.out.println("The heart is pumping blood.");
    } else {
      System.out
          .println("The heart is not beating. Blood circulation is stopped.");
    }
  }

  public void transportOxygenAndNutrients(Heart heart) {
    double oxygenAmount = heart.getOxygenRequirement();
    double nutrientAmount = heart.getNutrientRequirement();

    if (oxygenLevel >= oxygenAmount && glucoseLevel >= nutrientAmount) {
      oxygenLevel -= oxygenAmount;
      glucoseLevel -= nutrientAmount;
      System.out.println("Blood is transporting oxygen and nutrients to the "
          + heart.getClass().getSimpleName() + ".");
    } else {
      System.out.println(
          "Insufficient oxygen and nutrients in the blood to support the "
              + heart.getClass().getSimpleName() + ".");
    }
  }


}


