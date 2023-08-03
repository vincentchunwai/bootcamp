package Country;

public abstract class Country {
  private String name;
  private String currency;
  private double population;
  private double GDP;
  public boolean isWellDeveloped = false;

  public Country(){

  }

  public Country(String name, String currency, double population, double GDP){
    this.name = name;
    this.currency = currency;
    this.population = population;
    this.GDP = GDP;
  }

  public void setName (String name){
    this.name = name;
  }

  public void setCurrency (String currency){
    this.currency = currency;
  }
  
  public void setPopulation (double population){
    this.population = population;
  }

  public void setGDP (double GDP){
    this.GDP = GDP;
  }

  public String getName (){
    return this.name;
  }

  public String getCurrency(){
    return this.currency;
  }

  public double getPopulaton(){
    return this.population;
  }

  public double getGDP(){
    return this.GDP;
  }

  public boolean getLevelOfDevelopment(){
    return this.isWellDeveloped;
  }



  
}
