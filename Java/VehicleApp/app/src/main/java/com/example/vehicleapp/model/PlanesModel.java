package com.example.vehicleapp.model;

public class PlanesModel {
    private int imagePlanes;
    private String textPlanes;

    public PlanesModel(int imagePlanes, String textPlanes) {
        this.imagePlanes = imagePlanes;
        this.textPlanes = textPlanes;
    }

    public int getImagePlanes() {
        return imagePlanes;
    }

    public void setImagePlanes(int imagePlanes) {
        this.imagePlanes = imagePlanes;
    }

    public String getTextPlanes() {
        return textPlanes;
    }

    public void setTextPlanes(String textPlanes) {
        this.textPlanes = textPlanes;
    }
}
