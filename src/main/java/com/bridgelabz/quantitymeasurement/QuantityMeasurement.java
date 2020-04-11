package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    private double value = 0.0;
    private Unit unit = null;

    //DEFAULT CONSTRUCTOR
    public QuantityMeasurement() {
    }

    //PARAMETERISED CONSTRUCTOR
    public QuantityMeasurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

    public enum Unit {FEET_VALUE, INCH_VALUE}
}
