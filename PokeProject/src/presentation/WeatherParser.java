package presentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.PokemonType;
import model.Weather;

public class WeatherParser {

  public WeatherParser() {

  }

  public void parse(Connection con) {
    JSONParser jsonParser = new JSONParser();
    try {
      JSONArray jsonObject = (JSONArray) jsonParser.parse(new FileReader("Weather.json"));
      PreparedStatement pstmt = con.prepareStatement("INSERT INTO Weather VALUES (?, ? )");
      String weather;
      String typeList;
      for (Object object : jsonObject) {
        JSONObject record = (JSONObject) object;
        JSONObject data = (JSONObject) record.get("data");
        JSONObject affinity = (JSONObject) data.get("weatherAffinities");
        weather = (String) affinity.get("weatherCondition");
        JSONArray types = (JSONArray) affinity.get("pokemonType");
        typeList = types.toString();

        pstmt.setString(1, weather);
        pstmt.setString(2, typeList);
        pstmt.executeUpdate();
      }
      System.out.println("Records inserted.....");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
