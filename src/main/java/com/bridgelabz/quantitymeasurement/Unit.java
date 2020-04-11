package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(1),INCH(1),
    FEET_TO_INCH(1 * 12.0), INCH_TO_FEET(1 / 12.0),
    FEET_TO_YARD(1 / 3.0), YARD_TO_FEET(1 * 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36.0),
    INCH_TO_CENTIMETER(1 * 2.54), CENTIMETER_TO_INCH(1 / 2.54);

    public final double lengthValue;

    Unit(double lengthValue) {
        this.lengthValue = lengthValue;
    }
}
