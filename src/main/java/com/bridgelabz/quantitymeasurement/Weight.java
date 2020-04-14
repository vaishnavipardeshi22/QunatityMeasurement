package com.bridgelabz.quantitymeasurement;

public enum  Weight implements UnitInterface{

    KILOGRAM_TO_GRAM(1 * 1000.0), GRAM_TO_KILOGRAM(1 / 1000.0),
    TONNE_TO_KILOGRAM(1 * 1000.0);

    private Double weightValue;

    Weight(Double weightValue){
        this.weightValue = weightValue;
    }

    @Override
    public double getConversionValue(Double unitValue) {
        return this.weightValue * unitValue;
    }
}
