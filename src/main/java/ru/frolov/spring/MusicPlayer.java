package ru.frolov.spring;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public MusicPlayer(List<Music> music){
        this.music = music;
    }

    public MusicPlayer() {}


    public void setMusic(List<Music> music){
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playMusic(){
        for (Music musicItem: music){
            System.out.println("Playing: "+musicItem.getSong());
        }
    }


    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
