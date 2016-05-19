package com.github.booknara.musicshop;

/**
 * @author : Daehee Han(@daniel_booknara) on 5/10/16.
 */
public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;
    private InstrumentType type;

    public Instrument(String serialNumber, double price, InstrumentSpec spec, InstrumentType type) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    public InstrumentType getType() {
        return type;
    }
}
