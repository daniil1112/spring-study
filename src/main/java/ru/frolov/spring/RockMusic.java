package ru.frolov.spring;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music";
    }

    public void doInit(){
        System.out.println("Doing init");
    }

    public void doDestroy(){
        System.out.println("Doing destroy");
    }
}
