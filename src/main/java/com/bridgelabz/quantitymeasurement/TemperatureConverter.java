package com.bridgelabz.quantitymeasurement;

public class TemperatureConverter {
    private double value;
    private Temperature temperature;

    public TemperatureConverter(Temperature temperature, double value){
        this.temperature = temperature;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureConverter that = (TemperatureConverter) o;
        return Double.compare(that.value, value) == 0 &&
                temperature == that.temperature;
    }

    public boolean compareUnit(TemperatureConverter that){
        if (this.temperature.equals(Temperature.CELSIUS)){
            Double convertedValue = this.value * 9.0 / 5.0 + 32;
            Double value = that.value;
            return Double.compare(convertedValue, value) == 0;
        }
        Double firstValue = this.value;
        Double secondValue = that.value * 9.0 / 5.0 + 32.0;
        return Double.compare(firstValue, secondValue) == 0;
    }
}
