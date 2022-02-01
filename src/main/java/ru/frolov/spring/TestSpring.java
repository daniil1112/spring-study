package ru.frolov.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer" ,MusicPlayer.class);
        System.out.println(musicPlayer1 == musicPlayer);

        context.close();
    }
}
