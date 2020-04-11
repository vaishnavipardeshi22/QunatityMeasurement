package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET_TO_INCH(1 * 12.0),
    INCH_TO_FEET(1 / 12.0),
    FEET_TO_YARD(1 / 3.0),
    INCH_TO_YARD(1 / 36),
    YARD_TO_INCH(1 * 36);

    public final double lengthValue;

    Unit(double lengthValue) {
        this.lengthValue = lengthValue;
    }
}
