package ru.frolov.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//Init\destroy методы не должны принимать ничего в аргументах. Названия методов и модификаторы доступа любые. Вызвращает любой тип значения
        // Prototype не работает destroy

        RockMusic rockMusic = context.getBean("rockMusicBean", RockMusic.class);

        System.out.println(rockMusic.getSong());


        context.close();
    }
}
