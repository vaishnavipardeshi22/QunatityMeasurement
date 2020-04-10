package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {

    private double feetValue;
    private double inchValue;

    //FUNCTION TO GET FEET VALUE
    public double getFeetValue(double feetValue) {
        this.feetValue = feetValue;
        return feetValue;
    }

    //FUNCTION TO GET INCH VALUE
    public double getInchValue(double inchValue) {
        this.inchValue = inchValue;
        return inchValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() == o.getClass()) return true;
        if (o.equals(o))
            if (o.equals(o)) return true;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feetValue, feetValue) == 0;
    }
}
