package com.example.vehicleapp.model;

public class BoatsModel {
    private int imageBoats;
    private String textBoats;

    public BoatsModel(int imageBoats, String textBoats) {
        this.imageBoats = imageBoats;
        this.textBoats = textBoats;
    }

    public int getImageBoats() {
        return imageBoats;
    }

    public void setImageBoats(int imageBoats) {
        this.imageBoats = imageBoats;
    }

    public String getTextBoats() {
        return textBoats;
    }

    public void setTextBoats(String textBoats) {
        this.textBoats = textBoats;
    }
}
