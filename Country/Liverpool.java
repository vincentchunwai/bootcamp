package Country;

public class Liverpool extends Cities {
  
  public Liverpool (String cityName, int population, String OfficialLanguage, double CityGDP){
    super(cityName, population, OfficialLanguage, CityGDP);
    isWellDeveloped = true;
  }


   public void displayCityInfo(){
    System.out.println("City name = " + this.getCityName());
    System.out.println("population = " + this.getPopulation());
    System.out.println("Official Language = " + this.getOfficialLanguage());
  }

}
