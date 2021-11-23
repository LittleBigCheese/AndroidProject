package com.example.idlegame;


public class BasicIdleCounter {
    private long money = 0;
    private int increment = 1;
    public long getMoney() {
        return money;
    }
    public void setIncrement(int num){
        increment = num;
    }
    public void incrementMoney(){
    //Increments the money counter eaxh team
           money = money + increment;
        }
    }

