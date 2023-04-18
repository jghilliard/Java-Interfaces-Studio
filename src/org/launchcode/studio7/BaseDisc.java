package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseDisc {
    String name;
    double capacity;
    double speed;
    HashMap<Double, String> directory = new HashMap<>();

    public BaseDisc(){
        this.name = "disc1";
        this.capacity = 0;
    }

    public BaseDisc(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public double fileCount(){
        return directory.size();
    }

    public void setSpeed(double rpm){this.speed = rpm;}
    public void write(Double loc, String info){
        directory.put(loc, info);
        directory
    }

}
