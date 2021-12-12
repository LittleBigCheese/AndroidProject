package com.example.idlegame;


public class BasicIdleCounter {
    private long money = 0;
    public int attack = 0;
    public int defense = 0;
    private int increment = 1;
    private int decrement;
    public long getMoney() {
        return money;
    }
    public void setIncrement(int num){
        increment = num;
    }
    public void setDecrement(int num1) {decrement = num1}
    public void incrementMoney(){
    //Increments the money counter each time
           money = money + increment;
        }
    public void decrementMoney(){
        money = money - decrement;
    }
    public void incrementAttack(){

        attack++;
    }
    public void incrementDefense(){

        defense++;
    }
    }

