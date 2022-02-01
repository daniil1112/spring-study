package ru.frolov.spring;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music";
    }

    @PostConstruct
    private void doInit(){
        System.out.println("doing init");
    }
    @PreDestroy
    private void doDestroy(){
        System.out.println("doing destroy");
    }

}
