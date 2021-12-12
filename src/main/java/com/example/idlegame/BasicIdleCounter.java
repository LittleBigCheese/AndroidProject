package com.example.idlegame;


public class BasicIdleCounter {
    private long money = 0;
    public int costPB = 100; //base value for upgrade for punching bag
    public int costSword = 100; //base value for upgrade for sword
    public int costShield = 100; //base value for upgrade for shield
    public int attack = 0;
    public int defense = 0;
    private int increment = 1;
    public int decrement_PB;
    public int decrement_Sword;
    public int decrement_Shield;
    public long getMoney() {
        return money;
    }
    public long getCost_PB() { return costPB;}
    public long getCost_Sword() { return costSword;}
    public long getCost_Shield() { return costShield;}
    public void setIncrement(int num){
        increment = num;
    }
    public void incrementMoney(){
    //Increments the money counter each time
           money = money + increment;
        }
    public void decrementMoney_PB(){
        decrement_PB = costPB;
        money = money - decrement_PB;
        costPB = costPB * 2;
    }
    public void decrementMoney_Sword(){
        decrement_Sword = costSword;
        money = money - decrement_Sword;
        costSword = costSword * 2;
    }
    public void decrementMoney_Shield(){
        decrement_Shield = costShield;
        money = money - decrement_Shield;
        costShield = costShield * 2;
    }
    public void incrementAttack(){

        attack++;
    }
    public void incrementDefense(){

        defense++;
    }
    }

