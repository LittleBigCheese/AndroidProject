package com.example.idlegame;


public class BasicIdleCounter {
    private long money = 0;
    public int cost = 100;
    public int attack = 0;
    public int defense = 0;
    private int increment = 1;
    public int decrement = cost;
    public long getMoney() {
        return money;
    }
    public long getCost() { return cost;}
    public void setIncrement(int num){
        increment = num;
    }
    //public void setDecrement(int num1) { decrement = num1; }
    public void incrementMoney(){
    //Increments the money counter each time
           money = money + increment;
        }
    public void decrementMoney(){
        money = money - decrement;
        cost = cost * 2;
    }
    public void incrementAttack(){

        attack++;
    }
    public void incrementDefense(){

        defense++;
    }
    }

