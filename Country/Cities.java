package Country;

public abstract class Cities {
  private String cityName;
  private int population;
  private String OfficialLanguage;
  private double CityGDP;
  boolean isWellDeveloped = false;

  public Cities(){

  }

  public Cities(String cityName, int population, String OfficialLanguage, double CityGDP) {
    this.cityName = cityName;
    this.population = population;
    this.OfficialLanguage = OfficialLanguage;
    this.CityGDP = CityGDP;
  }

  public abstract void displayCityInfo();

  public void print(){
    System.out.println(this.cityName.toString());
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String getOfficialLanguage(){
    return this.OfficialLanguage;
  }

  public void setOfficialLanguage(String OfficialLanguage){
    this.OfficialLanguage = OfficialLanguage;
  }

  public double getCityGDP(){
    return this.CityGDP;
  }

  public boolean getLevelOfDevelopment(){
    return this.isWellDeveloped;
  }
}
