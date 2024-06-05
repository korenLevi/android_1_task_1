package com.example.myrecycleview.models;

public class DataModel {



    String name;

    String version;

    int image;

    int id;



    public DataModel(String name, String version, int image, int id) {

        this.name = name;

        this.version = version;

        this.image = image;

        this.id = id;

    }



    public String getName() {

        return name;

    }



    public String getVersion() {

        return version;

    }



    public int getImage() {

        return image;

    }



    public int getId() {

        return id;

    }

}

