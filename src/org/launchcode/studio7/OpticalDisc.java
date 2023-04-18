package org.launchcode.studio7;

import java.util.HashMap;

public interface OpticalDisc {
    String shape = "Circle";
    String spinDirection = "CounterClockWise";
    boolean needsLaser = true;
    void spinDisc();
    void stopDisc();
    //void write(String data);
    void setSpeed(double speed);
    String read(double location);
    String getInfo();





}
