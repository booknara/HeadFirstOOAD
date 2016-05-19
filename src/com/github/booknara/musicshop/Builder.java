package com.github.booknara.musicshop;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public enum Builder {
    FENDER,
    MARTIN,
    GIBSON,
    COLLINGS,
    OLSON,
    RYAN,
    PRS,
    ANY;

    public String toString() {
        switch (this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            case OLSON: return "Olson";
            case RYAN: return "Ryan";
            case PRS: return "Prs";
            case ANY: return "Any";
            default: return "Unspecified";
        }
    }
}
