package com.example.simp;

public class PopMusic implements Music {

    private String time;

    @Override
    public String getSongNameAndTime() {
        return "Sweat dreams " + time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
