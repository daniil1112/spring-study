package ru.frolov.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        System.out.println(rockMusic.getSong());


        context.close();
    }
}
