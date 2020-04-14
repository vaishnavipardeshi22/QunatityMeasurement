package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurementException extends Exception{

    public enum ExceptionType{
        UNIT_NOT_EQUAL, NO_ADDITION_POSSIBLE;
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
