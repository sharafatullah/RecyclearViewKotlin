package com.kotlinpractise;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Models implements Serializable{

    String Id;
    String Name;
    String Desciption;
    int drawable;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public Models(String id, String name, String desciption, int drawable) {
        Id = id;
        Name = name;
        Desciption = desciption;
        this.drawable = drawable;
    }
}
