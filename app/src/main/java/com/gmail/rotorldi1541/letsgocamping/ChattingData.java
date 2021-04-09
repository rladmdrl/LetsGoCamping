package com.gmail.rotorldi1541.letsgocamping;

public class ChattingData {

    private String name;
    private String mag;
    private String date;

    public ChattingData(String name, String mag, String date) {
        this.name = name;
        this.mag = mag;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
