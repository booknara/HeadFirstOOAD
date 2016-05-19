package com.github.booknara.musicshop;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        this.inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec, InstrumentType type) {
        Instrument instrument = new Instrument(serialNumber, price, spec, type);

        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument i : inventory) {
            if (i.getSerialNumber().equals(serialNumber))
                return i;
        }

        return null;
    }

    public List<Instrument> search(InstrumentSpec spec) {
        List<Instrument> matchingInstrument = new LinkedList<>();

        for (Instrument i : inventory) {
            if (i.getSpec().matches(spec))
                matchingInstrument.add(i);

        }

        return matchingInstrument;
    }
}
