package com.example.simp;

public class Player {

    Music music;

    public Player(Music music) {
        this.music = music;
    }

    void play() {
        System.out.println(music.getSongNameAndTime());
    }
}
