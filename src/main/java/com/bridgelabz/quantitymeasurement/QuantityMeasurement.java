package com.bridgelabz.quantitymeasurement;

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

    //FUNCTION TO GET CONVERTED VALUE
    public double getConversion(double conversionValue) {
        if (unitType.equals(Unit.FAHRENHITE_TO_CELSIUS))
            return ((conversionValue - 32) * unitType.lengthValue);
        return (conversionValue * unitType.lengthValue);
    }

    //FUNCTION TO ADD QUANTITY
    public double getAddition(double firstQuantity, double secondQuantity) {
        return (firstQuantity + secondQuantity);
    }
}
