package org.epicseven.heroes.models;

public class Heroes {

    private int id;
    private static int nextId = 1;

    private String name;
    private int level;
    private int attack;
    private int health;
    private int defense;
    private int critHitChance;
    private int critHitDamage;
    private int dualAttack;
    private int effectiveness;
    private int effectResist;
    private int speed;

    public Heroes(String name,
                  int level,
                  int attack,
                  int health,
                  int defense,
                  int critHitChance,
                  int critHitDamage,
                  int dualAttack,
                  int effectiveness,
                  int effectResist,
                  int speed) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.critHitChance = critHitChance;
        this.critHitDamage = critHitDamage;
        this.dualAttack = dualAttack;
        this.effectiveness = effectiveness;
        this.effectResist = effectResist;
        this.speed = speed;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCritHitChance() {
        return critHitChance;
    }

    public void setCritHitChance(int critHitChance) {
        this.critHitChance = critHitChance;
    }

    public int getCritHitDamage() {
        return critHitDamage;
    }

    public void setCritHitDamage(int critHitDamage) {
        this.critHitDamage = critHitDamage;
    }

    public int getDualAttack() {
        return dualAttack;
    }

    public void setDualAttack(int dualAttack) {
        this.dualAttack = dualAttack;
    }

    public int getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(int effectiveness) {
        this.effectiveness = effectiveness;
    }

    public int getEffectResist() {
        return effectResist;
    }

    public void setEffectResist(int effectResist) {
        this.effectResist = effectResist;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
