package com.example.idlegame;


public class BasicIdleCounter {
    private long money = 0;
    public int Num_PB = 1;
    public int costPB = 100; //base value for upgrade for punching bag
    public int costSword = 100; //base value for upgrade for sword
    public int costShield = 100; //base value for upgrade for shield
    public int attack = 0;
    public int defense = 0;
    private int increment = Num_PB;
    public int decrement_PB;
    public int decrement_Sword;
    public int decrement_Shield;

    public long getMoney() {
        return money;
    }
    public int getCost_PB() { return costPB;}
    public int getCost_Sword() { return costSword;}
    public int getCost_Shield() { return costShield;}
    public int getNumOfPunchingBags() { return Num_PB;}
    public int getNumOfSwords() { return attack;}
    public int getNumOfShield() { return defense;}

    //public void setIncrement(int num){
    //    increment = num;
    //}
    public void incrementMoney(){
    //Increments the money counter each time
           money = money + increment;
        }
    public void decrementMoney_PB(){
        if(costPB < money)
        {
            decrement_PB = costPB;
            money = money - decrement_PB;
            costPB = costPB * 2;
            Num_PB++;
        }
        else
        {
            //function call for function that displays insufficient funds message on screen
        }
    }

    public void decrementMoney_Sword(){
        if(costSword < money)
        {
            incrementAttack();
            decrement_Sword = costSword;
            money = money - decrement_Sword;
            costSword = costSword * 2;
        }
        else
        {
            //function call for function that displays insufficient funds message on screen
        }
    }

    public void decrementMoney_Shield(){
        if(costShield < money)
        {
            incrementDefense();
            decrement_Shield = costShield;
            money = money - decrement_Shield;
            costShield = costShield * 2;
        }
        else
        {
            //function call for function that displays insufficient funds message on screen
        }
    }

    public void incrementAttack(){

        attack++;
    }
    public void incrementDefense(){

        defense++;
    }
    }

