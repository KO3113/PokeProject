package presentation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.PokemonType;
import model.Weather;

public class WeatherParser {

  public WeatherParser() {

  }

  public Weather parse(JSONObject j) {
    JSONArray a = (JSONArray) j.get("Weather");
    for (Object o : a) {
      if (o instanceof JSONObject) {
        PokemonType[] t = (PokemonType[]) ((JSONObject) o).get("pokemonType");
        String weather = (String) ((JSONObject) o).get("weatherCondition");
        Weather w = new Weather(weather, t);
        return w;
      }
    }
    return null;
  }

}
