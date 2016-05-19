package com.github.booknara.dogdoor;

import java.util.List;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/2/16.
 */
public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("\t" + "BarkRecognizer : Heard a " + bark);
        boolean open = false;
        List<Bark> allowedBarks = door.getAllowedBarks();
        for (Bark b : allowedBarks) {
            if (b.equals(bark)) {
                open = true;
            }
        }

        if (open)
            door.open();
        else
            System.out.println("This dog is not allowed");
    }
}
