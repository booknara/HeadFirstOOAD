package com.github.booknara.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Daehee Han(@daniel_booknara) on 5/2/16.
 */
public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();
        }
    }
}
