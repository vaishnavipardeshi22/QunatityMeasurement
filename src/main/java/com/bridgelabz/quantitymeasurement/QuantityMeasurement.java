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
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feetValue, feetValue) == 0;
    }
}
