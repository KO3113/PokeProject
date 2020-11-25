package model;

public class ChargeMove extends Move{

  public ChargeMove(String name, int moveId, PokemonType type, 
      Long duration, Long damageStart, Long damageEnd, Long power, Long energyDelta) {
    super(name, moveId, type, duration, damageStart, damageEnd, power, energyDelta);
  }

}
