package com.gmail.rotorldi1541.letsgocamping;

public class MainData {
    private int img;
    private String title;
    private String mag;

    public MainData(int img, String title, String mag) {
        this.img = img;
        this.title = title;
        this.mag = mag;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }
}
