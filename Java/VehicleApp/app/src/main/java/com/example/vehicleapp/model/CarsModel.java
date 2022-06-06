package com.example.vehicleapp.model;

public class CarsModel {
    private int imageCars;
    private String textCars;

    public CarsModel(int imageCars, String textCars) {
        this.imageCars = imageCars;
        this.textCars = textCars;
    }

    public int getImageCars() {
        return imageCars;
    }

    public void setImageCars(int imageCars) {
        this.imageCars = imageCars;
    }

    public String getTextCars() {
        return textCars;
    }

    public void setTextCars(String textCars) {
        this.textCars = textCars;
    }
}
