package com.github.booknara.musicshop;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public enum Type {
    ACOUSTIC,
    ELECTRIC;

    public String toString() {
        switch (this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "Unspecified";
        }
    }
}
