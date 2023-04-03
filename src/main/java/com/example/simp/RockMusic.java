package com.example.simp;

public class RockMusic implements Music {

    private String time;

    @Override
    public String getSongNameAndTime() {
        return "She is my sin " + time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
