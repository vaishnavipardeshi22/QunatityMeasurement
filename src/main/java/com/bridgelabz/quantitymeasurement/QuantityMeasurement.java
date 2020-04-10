package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    private double feetValue;

    public double getFeetValue(double feetValue) {
        this.feetValue = feetValue;
        return feetValue;
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
