package Country;

public class UnitedKingDom extends Country {
  Cities[] cities;

  public UnitedKingDom(String name, String currency, double population, double GDP, Cities[] cities){
    super(name, currency, population, GDP);
    this.cities = cities;
  }
  public Cities getCity (String name, boolean LevelOfDevelopment){
    int target = 0;
    for(int i = 0; i < cities.length; i++){
      if (name.equals(cities[i].getCityName()) && LevelOfDevelopment == cities[i].getLevelOfDevelopment()){
        target = i;
      }
    }
    return cities[target];
  }


  public void checkGDP(){
    if (super.getGDP() > 1900000)
    isWellDeveloped = true;
  }

  public static void main(String[] args) {
    Liverpool liverpool = new Liverpool("Liverpool", 92282, "English", 90000);
    London london = new London("London", 28222, "English", 910202);
    UnitedKingDom UK = new UnitedKingDom("UK", "GBP", 6733333, 430020, new Cities[] {liverpool, london});

    liverpool.displayCityInfo();
    london.displayCityInfo();
    System.out.println(UK.getCity("Liverpool", true).getCityGDP());
    UK.getCity("London", true).print();
  }
}
