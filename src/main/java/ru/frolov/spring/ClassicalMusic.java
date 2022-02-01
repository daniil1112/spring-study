package ru.frolov.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "classical music";
    }

    public void doInit(){
        System.out.println("Doing init");
    }

    public void doDestroy(){
        System.out.println("Doing destroy");
    }
}
