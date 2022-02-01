package ru.frolov.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component()
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music";
    }

}
