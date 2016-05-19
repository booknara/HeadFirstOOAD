package com.github.booknara.dogdoor;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/6/16.
 */
public class Bark {
    String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bark bark = (Bark) o;

        return sound != null ? sound.equals(bark.sound) : bark.sound == null;

    }

    @Override
    public int hashCode() {
        return sound != null ? sound.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "'" + sound + "'";
    }
}
