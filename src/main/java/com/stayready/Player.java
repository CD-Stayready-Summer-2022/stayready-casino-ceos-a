package com.stayready;

public class Player {
    private String name;
    private int age;
    private double money;


    public Player(String name, int age, double money){
        this.name=name;
        this.age=age;
        this.money=money;

    }

    public String name() {
        return name;
    }

    public int age() {return age;}
    public double money() {return money;}

    public  String getName(){
        return this.name;
    }
    public  void setName(String windows){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public double getMoney(){
        return this.money;
    }
    public void setMoney(double money){
        this.money=money;
    }


}
