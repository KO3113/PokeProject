package model;

public abstract class Move {

  String name;
  int moveId;
  PokemonType type;
  Long duration;
  Long damageStart;
  Long damageEnd;
  Long power;
  Long energyDelta;

  public Move(String name, int moveId, PokemonType type, Long duration, Long damageStart, Long damageEnd, Long power,
      Long energyDelta) {
    super();
    this.name = name;
    this.moveId = moveId;
    this.type = type;
    this.duration = duration;
    this.damageStart = damageStart;
    this.damageEnd = damageEnd;
    this.power = power;
    this.energyDelta = energyDelta;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoveId() {
    return moveId;
  }

  public void setMoveId(int moveId) {
    this.moveId = moveId;
  }

  public PokemonType getType() {
    return type;
  }

  public void setType(PokemonType type) {
    this.type = type;
  }

  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public Long getDamageStart() {
    return damageStart;
  }

  public void setDamageStart(Long damageStart) {
    this.damageStart = damageStart;
  }

  public Long getDamageEnd() {
    return damageEnd;
  }

  public void setDamageEnd(Long damageEnd) {
    this.damageEnd = damageEnd;
  }

  public Long getPower() {
    return power;
  }

  public void setPower(Long power) {
    this.power = power;
  }

  public Long getEnergyDelta() {
    return energyDelta;
  }

  public void setEnergyDelta(Long energyDelta) {
    this.energyDelta = energyDelta;
  }

}
