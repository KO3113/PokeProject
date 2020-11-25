package datasource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.ChargeMove;
import model.FastMove;
import model.Pokemon;
import model.PokemonType;

class TestPokemon {

  @Test
  void testLevel() {
    ArrayList<FastMove> fm= new ArrayList<>();
    ArrayList<ChargeMove> cm= new ArrayList<>();
    Pokemon p = new Pokemon("VENUSAUR", 473, 198, 189, 190, 
        PokemonType.POKEMON_TYPE_GRASS, PokemonType.POKEMON_TYPE_POISON, fm, cm);
    Pokemon p1 = new Pokemon("MACHAMP", 68, 234, 159, 207, 
        PokemonType.POKEMON_TYPE_FIGHTING, null, fm, cm);
    Pokemon p2 = new Pokemon("VAPOREON", 134, 205, 161, 277, 
        PokemonType.POKEMON_TYPE_WATER, null, fm, cm);
    Pokemon p3 = new Pokemon("BLAZIKEN", 257, 240, 141, 190, 
        PokemonType.POKEMON_TYPE_FIRE, PokemonType.POKEMON_TYPE_FIGHTING, fm, cm);
    p.setAttackIV(15);
    p.setDefenseIV(15);
    p.setStaminaIV(13);
    p.setCp(2455);
    p.setHp(152);
    p.setLevel();
    
    p1.setAttackIV(15);
    p1.setDefenseIV(14);
    p1.setStaminaIV(8);
    p1.setCp(2705);
    p1.setHp(161);
    p1.setLevel();
    
    p2.setAttackIV(12);
    p2.setDefenseIV(15);
    p2.setStaminaIV(13);
    p2.setCp(2734);
    p2.setHp(216);
    p2.setLevel();
    
    p3.setAttackIV(15);
    p3.setDefenseIV(13);
    p3.setStaminaIV(13);
    p3.setCp(2413);
    p3.setHp(148);
    p3.setLevel();
    
    assertEquals(33.5, p.getLevel());
    assertEquals(33.0, p1.getLevel());
    assertEquals(32.5, p2.getLevel());
    assertEquals(30.0, p3.getLevel());
  }

}
