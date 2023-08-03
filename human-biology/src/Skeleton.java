
public class Skeleton {
  private Heart heart;
  private Lung lung;
  private Kidney kidney;
  private Liver liver;
  private Blood blood;
  private Food food;
  private Muscle biceps;
  private Muscle quadriceps;

  public Skeleton() {
    createHeart();
    createLung();
    createKidney();
    createLiver();
    blood = new Blood();
    food = new Food("Apple", 100, 50);
    biceps = new Muscle("Biceps", "flexion of the elbow joint", 50.0);
    quadriceps = new Muscle("Quadriceps", "Extension of the knee joint", 70.0);
  }

  private void createHeart() {
    heart = new Heart("Heart", "Pumping blood", 80.0);
  }

  private void createLung() {
    lung = new Lung("Lung", "Gas exchange", 500);
  }

  private void createKidney() {
    kidney = new Kidney("Kidney", "Filtration", 50.0, 0.0);
  }

  private void createLiver() {
    liver = new Liver("Liver", "Detoxification", 30.0);
  }
  public void simulateMuscleActions(){
    biceps.contract();
    quadriceps.contract();
  }

  public void simulateHumanBody() {
    heart.startBeating();
    heart.pump();

    lung.breathe();

    kidney.filter();;
    kidney.excreteUrine();

    liver.detoxify();
    liver.processNutrientsFromFood(this.food);

    blood.pumpBlood(heart);
    blood.transportOxygenAndNutrients(heart);

    heart.stopsBeating();
  }

  public static void main(String[] args) {
    Skeleton humanBody = new Skeleton();
    humanBody.simulateHumanBody();
  }
}
