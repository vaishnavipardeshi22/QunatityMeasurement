package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET_TO_INCH(1 * 12.0),
    INCH_TO_FEET(1 / 12.0);

    public final double lengthValue;

    Unit(double lengthValue) {
        this.lengthValue = lengthValue;
    }
}
