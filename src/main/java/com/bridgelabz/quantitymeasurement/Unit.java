package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(1),INCH(1),
    FEET_TO_INCH(1 * 12.0), INCH_TO_FEET(1 / 12.0),
    FEET_TO_YARD(1 / 3.0), YARD_TO_FEET(1 * 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36.0),
    INCH_TO_CENTIMETER(1 * 2.54), CENTIMETER_TO_INCH(1 / 2.54),
    GALLON_TO_LITRES(1 * 3.78),
    LITRE_TO_MILLILITRE(1 * 1000.0), MILLILITRE_TO_LITRE(1 / 1000.0),
    KILOGRAM_TO_GRAM(1 * 1000.0), GRAM_TO_KILOGRAM(1 / 1000.0),
    TONNE_TO_KILOGRAM(1 * 1000.0),
    FAHRENHITE_TO_CELSIUS(1 * 5.0 / 9.0);

    public final double lengthValue;

    Unit(double lengthValue) {
        this.lengthValue = lengthValue;
    }
}
