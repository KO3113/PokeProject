package model;

public class Weather {

  String weather;
  PokemonType[] affectedTypes;
  
  public Weather(String weather, PokemonType[] affectedTypes) {
    super();
    this.weather = weather;
    this.affectedTypes = affectedTypes;
  }

  public String getWeather() {
    return weather;
  }

  public void setWeather(String weather) {
    this.weather = weather;
  }

  public PokemonType[] getAffectedTypes() {
    return affectedTypes;
  }

  public void setAffectedTypes(PokemonType[] affectedTypes) {
    this.affectedTypes = affectedTypes;
  }
  
  
}
