package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public class CD extends BaseDisc implements OpticalDisc{
    public CD() {
        super();
    }

    public CD(String name, double capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("Disc: "+this.name+" is spinning.");
    }

    @Override
    public void stopDisc() {
        System.out.println("Disc: "+this.name+" has stopped.");
    }

    @Override
    public String read(double location) {
        return directory.get(location);

    }



    @Override
    public String getInfo() {
        return "'" + name +"'\n" +"Size: " + capacity +"MB\n" +
                speed +"RPM\n"+ "Spins: " + spinDirection +
                "\nNeeds laser? "+ true +"\n\n" + "Files: " +fileCount();
    }
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
