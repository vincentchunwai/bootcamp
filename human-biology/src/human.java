import java.math.BigDecimal;

enum Gender {
  MALE, FEMALE;
}


public class human {

  private String name;
  private Gender gender;
  private int age;
  private int height;
  private int weight;
  private double totalCaloriesConsumed;

  private Blood blood;
  private Genetic genetic;
  private Muscle muscle;
  private NervousSystem nervousSystem;
  private Organ organ;
  private Skeleton skeleton;

  private human(String name, Gender gender, int age, int weight, int height) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.nervousSystem = new NervousSystem();
    this.skeleton = new Skeleton();
    this.muscle = new Muscle("Biceps", "flexion of the elbow joint", 50.0);
    this.blood = new Blood();
    this.totalCaloriesConsumed = 0;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }

  public Gender getGender() {
    return this.gender;
  }

  public int getAge() {
    return this.age;
  }

  public int getHeight() {
    return this.height;
  }

  public int getWeight() {
    return this.weight;
  }

  public double calculateBMR() {
    double bmr;
    if (gender == Gender.MALE) {
      bmr = 88.362 + (13.397 * this.weight) + (4.799 * this.height)
          - (5.677 * this.age);
    } else {
      bmr = 447.593 + (9.247 * this.weight) + (3.098 * this.height)
          - (4.330 * this.age);
    }
    return bmr;
  }

  public double calculateCalorieNeeds(ActivityLevel activityLevel) {
    double bmr = calculateBMR();
    double activityFactor = activityLevel.getActivityFactor();
    return bmr * activityFactor;
  }


  public void eat(Food food) {
    double caloriesConsumed = food.getCalories();
    this.totalCaloriesConsumed += caloriesConsumed;
    this.weight += food.getCalories();
    System.out.println(this.name + "ate" + food.getName());
    System.out.println("You gained" + food.getCalories() + "calories");
  }

  public void exercise(double calorieBurned) {
    this.weight -= calorieBurned;
  }

  public void processSensoryInput(String input) {
    nervousSystem.processSensoryInput(input);
  }

  public void enableReflexes() {
    nervousSystem.enableReflexes();
  }

  public void disableReflexes() {
    nervousSystem.disableReflexes();
  }

  public Genetic getGenetic() {
    return this.genetic;
  }

  public Skeleton getSkeleton() {
    return skeleton;
  }

  public boolean isDiagnosedType2Diabetes(){
    Type2Diabetes diabetes = new Type2Diabetes(this.totalCaloriesConsumed);
    return diabetes.isDiagnosed();
  }

}




