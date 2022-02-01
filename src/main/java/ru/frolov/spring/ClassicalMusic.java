package ru.frolov.spring;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "classical music";
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doInit(){
        System.out.println("Doing init");
    }

    public void doDestroy(){
        System.out.println("Doing destroy");
    }
}
