package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    Unit unitType;

    //PARAMETERISED CONSTRUCTOR
    public QuantityMeasurement(Unit unitType) {
        this.unitType = unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return unitType == that.unitType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitType);
    }

    public double getConversion(double lengthValue) {
        return (lengthValue * unitType.lengthValue);
    }
}
