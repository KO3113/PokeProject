package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Pokemon {

  String name;

  int dexNumber;
  int baseAttack;
  int baseDefense;
  int baseStamina;
  int cp;
  int attackIV;
  int defenseIV;
  int staminaIV;
  int hp;

  double level;

  PokemonType type1;
  PokemonType type2;

  ArrayList<FastMove> possibleFM;
  FastMove fastMove;

  ArrayList<ChargeMove> possibleCM;
  ChargeMove chargeMove;

  public Pokemon(String name, int dexNumber, int baseAttack, int baseDefense, int baseStamina, PokemonType type1,
      PokemonType type2, ArrayList<FastMove> possibleFM, ArrayList<ChargeMove> possibleCM) {
    super();
    this.name = name;
    this.dexNumber = dexNumber;
    this.baseAttack = baseAttack;
    this.baseDefense = baseDefense;
    this.baseStamina = baseStamina;
    this.type1 = type1;
    this.type2 = type2;
    this.possibleFM = possibleFM;
    this.possibleCM = possibleCM;
  }
  
  public Pokemon(String name, int aIV, int dIV, int sIV) {
    this.name = name;
    this.attackIV = aIV;
    this.defenseIV = dIV;
    this.staminaIV = sIV;
    this.setLevel();
  }

  public void setIVs(int a, int d, int s) {
    this.attackIV = a;
    this.defenseIV = d;
    this.staminaIV = s;
    this.setLevel();
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getCp() {
    return cp;
  }

  public void setCp(int cp) {
    this.cp = cp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDexNumber() {
    return dexNumber;
  }

  public void setDexNumber(int dexNumber) {
    this.dexNumber = dexNumber;
  }

  public int getBaseAttack() {
    return baseAttack;
  }

  public void setBaseAttack(int baseAttack) {
    this.baseAttack = baseAttack;
  }

  public int getBaseDefense() {
    return baseDefense;
  }

  public void setBaseDefense(int baseDefense) {
    this.baseDefense = baseDefense;
  }

  public int getBaseStamina() {
    return baseStamina;
  }

  public void setBaseStamina(int baseStamina) {
    this.baseStamina = baseStamina;
  }

  public int getAttackIV() {
    return attackIV;
  }

  public void setAttackIV(int attackIV) {
    this.attackIV = attackIV;
  }

  public int getDefenseIV() {
    return defenseIV;
  }

  public void setDefenseIV(int defenseIV) {
    this.defenseIV = defenseIV;
  }

  public int getStaminaIV() {
    return staminaIV;
  }

  public void setStaminaIV(int staminaIV) {
    this.staminaIV = staminaIV;
  }

  public PokemonType getType1() {
    return type1;
  }

  public void setType1(PokemonType type1) {
    this.type1 = type1;
  }

  public PokemonType getType2() {
    return type2;
  }

  public void setType2(PokemonType type2) {
    this.type2 = type2;
  }

  public ArrayList<FastMove> getPossibleFM() {
    return possibleFM;
  }

  public void setPossibleFM(ArrayList<FastMove> possibleFM) {
    this.possibleFM = possibleFM;
  }

  public FastMove getFastMove() {
    return fastMove;
  }

  public void setFastMove(FastMove fastMove) {
    this.fastMove = fastMove;
  }

  public ArrayList<ChargeMove> getPossibleCM() {
    return possibleCM;
  }

  public void setPossibleCM(ArrayList<ChargeMove> possibleCM) {
    this.possibleCM = possibleCM;
  }

  public ChargeMove getChargeMove() {
    return chargeMove;
  }

  public void setChargeMove(ChargeMove chargeMove) {
    this.chargeMove = chargeMove;
  }

  public static final Map<Double, Double> CPM;
  static {
    LinkedHashMap<Double, Double> tmp = new LinkedHashMap<Double, Double>();

    tmp.put(1.0, 0.094);
    tmp.put(1.5, 0.135);
    tmp.put(2.0, 0.166);
    tmp.put(2.5, 0.192);
    tmp.put(3.0, 0.215);
    tmp.put(3.5, 0.236);
    tmp.put(4.0, 0.255);
    tmp.put(4.5, 0.273);
    tmp.put(5.0, 0.290);
    tmp.put(5.5, 0.306);
    tmp.put(6.0, 0.321);
    tmp.put(6.5, 0.335);
    tmp.put(7.0, 0.349);
    tmp.put(7.5, 0.362);
    tmp.put(8.0, 0.375);
    tmp.put(8.5, 0.387);
    tmp.put(9.0, 0.399);
    tmp.put(9.5, 0.411);

    tmp.put(10.0, 0.422);
    tmp.put(10.5, 0.432);
    tmp.put(11.0, 0.443);
    tmp.put(11.5, 0.453);
    tmp.put(12.0, 0.462);
    tmp.put(12.5, 0.472);
    tmp.put(13.0, 0.481);
    tmp.put(13.5, 0.490);
    tmp.put(14.0, 0.499);
    tmp.put(14.5, 0.508);
    tmp.put(15.0, 0.517);
    tmp.put(15.5, 0.525);
    tmp.put(16.0, 0.534);
    tmp.put(16.5, 0.542);
    tmp.put(17.0, 0.550);
    tmp.put(17.5, 0.558);
    tmp.put(18.0, 0.566);
    tmp.put(18.5, 0.574);
    tmp.put(19.0, 0.582);
    tmp.put(19.5, 0.589);

    tmp.put(20.0, 0.597);
    tmp.put(20.5, 0.604);
    tmp.put(21.0, 0.612);
    tmp.put(21.5, 0.619);
    tmp.put(22.0, 0.626);
    tmp.put(22.5, 0.633);
    tmp.put(23.0, 0.640);
    tmp.put(23.5, 0.647);
    tmp.put(24.0, 0.654);
    tmp.put(24.5, 0.661);
    tmp.put(25.0, 0.667);
    tmp.put(25.5, 0.674);
    tmp.put(26.0, 0.681);
    tmp.put(26.5, 0.687);
    tmp.put(27.0, 0.694);
    tmp.put(27.5, 0.700);
    tmp.put(28.0, 0.706);
    tmp.put(28.5, 0.713);
    tmp.put(29.0, 0.719);
    tmp.put(29.5, 0.725);

    tmp.put(30.0, 0.731);
    tmp.put(30.5, 0.734);
    tmp.put(31.0, 0.737);
    tmp.put(31.5, 0.740);
    tmp.put(32.0, 0.743);
    tmp.put(32.5, 0.746);
    tmp.put(33.0, 0.749);
    tmp.put(33.5, 0.752);
    tmp.put(34.0, 0.755);
    tmp.put(34.5, 0.758);
    tmp.put(35.0, 0.761);
    tmp.put(35.5, 0.764);
    tmp.put(36.0, 0.767);
    tmp.put(36.5, 0.770);
    tmp.put(37.0, 0.773);
    tmp.put(37.5, 0.776);
    tmp.put(38.0, 0.778);
    tmp.put(38.5, 0.781);
    tmp.put(39.0, 0.784);
    tmp.put(39.5, 0.787);
    tmp.put(40.0, 0.790);
    CPM = Collections.unmodifiableMap(tmp);
  }

  public static final Map<Double, Double> CPMReverse;
  static {
    Map<Double, Double> reverse = new HashMap<Double, Double>();
    for (Map.Entry<Double, Double> entry : CPM.entrySet()) {
      reverse.put(entry.getValue(), entry.getKey());
    }
    CPMReverse = Collections.unmodifiableMap(reverse);
  }

  public double getLevel() {
    return level;
  }

  public static double round(double d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(d);
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.doubleValue();
  }

  // ( (CP * 10) / (Attack * Defense^0.5 * Stamina^0.5) )^0.5
  public void setLevel() {
    double attack = baseAttack + attackIV * 1.0;
    double defense = Math.sqrt(baseDefense + defenseIV * 1.0);
    double stamina = Math.sqrt(baseStamina + staminaIV * 1.0);

    double cpm = round((Math.sqrt((cp * 10) / (attack * defense * stamina))), 3);
    for (Map.Entry<Double, Double> entry : CPM.entrySet()) {
      if(entry.getValue() == cpm) {
        this.level = entry.getKey();
        break;
      }
      if(entry.getValue() > cpm) {
        this.level = entry.getKey() -0.5;
        break;
      }
    }
  }

}
