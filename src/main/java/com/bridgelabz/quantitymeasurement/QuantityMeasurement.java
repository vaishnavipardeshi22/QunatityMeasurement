package com.bridgelabz.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    public UnitInterface unit;
    public Double unitValue;

    //PARAMETERISED CONSTRUCTOR
    public QuantityMeasurement(UnitInterface unit, Double unitValue) {
        this.unit = unit;
        this.unitValue = unitValue;
    }

    //FUNCTION TO CHECK EQUALITY
    public boolean compareUnit(QuantityMeasurement that) throws QuantityMeasurementException {
        if (!this.unit.getClass().equals(that.unit.getClass()))
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL,
                                                    "Unit are not equal.");
        Double firstUnitValue = Math.floor(this.unit.getConversionValue(this.unitValue));
        Double secondUnitValue = Math.floor(that.unit.getConversionValue(that.unitValue));
        return Double.compare(firstUnitValue, secondUnitValue) == 0;
    }

    //FUNCTION TO ADD UNIT VALUE
    public Double unitAddition(QuantityMeasurement that) throws QuantityMeasurementException {
        if (!this.unit.getClass().equals(that.unit.getClass()))
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NO_ADDITION_POSSIBLE,
                                                    "Can not be add.");
        Double firstUnitValue = this.unit.getConversionValue(this.unitValue);
        Double secondUnitValue = that.unit.getConversionValue(that.unitValue);
        return Double.sum(firstUnitValue, secondUnitValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Objects.equals(unit, that.unit) &&
                Objects.equals(unitValue, that.unitValue);
    }
}
