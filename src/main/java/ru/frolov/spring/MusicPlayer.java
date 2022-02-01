package ru.frolov.spring;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public MusicPlayer() {}


    public void setMusic(Music music){
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }


    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
