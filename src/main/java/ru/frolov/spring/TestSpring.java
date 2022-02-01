package ru.frolov.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        ClassicalMusic rockMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);


        System.out.println(rockMusic.getSong());


        context.close();
    }
}
