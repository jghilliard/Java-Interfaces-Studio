package org.launchcode.studio7;

import java.util.Map;

public class Main {

    public static void main(String[] args){
        CD testDisc = new CD("Lion King Soundtrack", 750);
        testDisc.setSpeed(300);
        testDisc.write(1.0, "Circle of Life -- Carmen Twillie");
        testDisc.write(2.0, "Just Can't Wait To Be King -- Rowan Atkinson");
        testDisc.write(3.0, "Be Prepared -- Cheech Marin");
        testDisc.write(4.0, "Hakuna Matata -- Ernie Sabella");
        testDisc.write(5.0, "Can You Feel The Love Tonight -- Ernie Sabella");
        testDisc.write(6.0, "The Morning Report -- Jef Bennett");
        testDisc.write(7.0, "This Land -- Hans Zimmer");
        testDisc.write(8.0, "To Die For -- Hans Zimmer");
        testDisc.write(9.0, "Under The Stars (Instrumental) -- Hans Zimmer");
        testDisc.write(10.0,"King Of Pride Rock -- Hans Zimmer");
        testDisc.write(11.0, "Circle Of Life -- Elton John");
        testDisc.write(12.0,"I Just Can't Wait To Be King -- Elton John");
        testDisc.write(13.0, "Can You Feel The Love Tonight -- Elton John");
        testDisc.write(14.0, "Can You Feel The Love Tonight (Remix) -- Elton John");


        System.out.println(testDisc.getInfo());

        for (Map.Entry<Double, String> ea: testDisc.directory.entrySet()){
            System.out.println(ea.getKey() +": "+ ea.getValue());

        }

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
