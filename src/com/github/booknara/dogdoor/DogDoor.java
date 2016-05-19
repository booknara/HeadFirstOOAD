package com.github.booknara.dogdoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Daehee Han(@daniel_booknara) on 5/2/16.
 */
public class DogDoor {
    private boolean open;
    private int openTime;
    private List<Bark> allowedBarks = new ArrayList<>();

    public DogDoor() {
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timer.cancel();
                close();
            }
        }, openTime * 1000);

    }

    public void close() {
        System.out.println("The dog door close.");
        open = false;
    }

    public void setOpenTime(int second) {
        this.openTime = second;
    }

    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }
}
