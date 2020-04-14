package com.bridgelabz.quantitymeasurement;

public enum Length implements UnitInterface{

    FEET(1.0), INCH(1.0),
    FEET_TO_INCH(1 * 12.0), INCH_TO_FEET(1 / 12.0),
    FEET_TO_YARD(1 / 3.0), YARD_TO_FEET(1 * 3.0),
    INCH_TO_YARD(1 / 36.0), YARD_TO_INCH(1 * 36.0),
    INCH_TO_CENTIMETER(1 * 2.54), CENTIMETER_TO_INCH(1 / 2.54);

    private final Double lengthValue;

    Length(Double lengthValue){
        this.lengthValue = lengthValue;
    }

    @Override
    public double getConversionValue(Double unitValue) {
        return this.lengthValue * unitValue;
    }
}
