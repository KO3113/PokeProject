package presentation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.Pokemon;
import model.PokemonType;
import model.Weather;

public class PokemonParser {

  public PokemonParser() {
    
  }
  public void parse(Connection con) {
    JSONParser jsonParser = new JSONParser();
    try {
      // Parsing the contents of the JSON file
//      String commonName = "place";
      String nameId = "";
      int id = -25;
      JSONArray jsonObject = (JSONArray) jsonParser.parse(new FileReader("Pokemon.json"));
      PreparedStatement pstmt = con.prepareStatement("INSERT INTO Pokemon VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )");
      for (Object object : jsonObject) {
        JSONObject record = (JSONObject) object;
        record.get("templateId");
        String template = (String) record.get("templateId");
        id = Integer.parseInt(template.substring(1, 5));
        nameId = template.substring(14);
        JSONObject data = (JSONObject) record.get("data");
        JSONObject pokemon = (JSONObject) data.get("pokemon");
//        commonName = (String) pokemon.get("uniqueId");
        if (template.contains("PURIFIED") || template.contains("SHADOW") || 
            template.contains("NORMAL") || template.contains("2019")) {
          continue;
        }
        String type1 = (String) pokemon.get("type1");
        String type2 = "";
        if (pokemon.containsKey("type2")) {
          type2 = (String) pokemon.get("type2");
        }
        JSONObject stats = (JSONObject) pokemon.get("stats");
        int baseStamina = ((Long) stats.get("baseStamina")).intValue();
        int baseDefense = ((Long) stats.get("baseDefense")).intValue();
        int baseAttack = ((Long) stats.get("baseAttack")).intValue();
        JSONArray quickMoves = (JSONArray) pokemon.get("quickMoves");
        JSONArray chargeMoves = (JSONArray) pokemon.get("cinematicMoves");
        String qm = quickMoves.toString();
        String cm = chargeMoves.toString();

        pstmt.setString(1, nameId);
//        pstmt.setString(2, commonName);
        pstmt.setInt(2, id);
        pstmt.setString(3, type1);
        pstmt.setString(4, type2);
        pstmt.setInt(5, baseAttack);
        pstmt.setInt(6, baseDefense);
        pstmt.setInt(7, baseStamina);
        pstmt.setString(8, qm);
        pstmt.setString(9, cm);
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
