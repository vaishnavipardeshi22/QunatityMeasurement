package com.bridgelabz.quantitymeasurement;

public enum Volume implements UnitInterface{

    LITRE(1.0), GALLON_TO_LITRES(1 * 3.78),
    LITRE_TO_MILLILITRE(1 * 1000.0), MILLILITRE_TO_LITRE(1 / 1000.0);

    private Double volumeValue;

    Volume(Double volumeValue){
        this.volumeValue = volumeValue;
    }

    @Override
    public double getConversionValue(Double unitValue) {
        return this.volumeValue * unitValue;
    }
}
