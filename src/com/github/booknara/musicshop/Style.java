package com.github.booknara.musicshop;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public enum Style {
    A,
    F;

    public String toString() {
        switch (this) {
            case A: return "a";
            case F: return "f";
            default: return "Unspecified";
        }
    }
}
