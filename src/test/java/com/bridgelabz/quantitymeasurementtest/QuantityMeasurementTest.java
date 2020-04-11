package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValueAsZero_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(0.0);
        Assert.assertEquals(firstFeetValue, secondFeetValue, 0.0);
    }

    @Test
    public void givenTwoDifferentFeet_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(1.1);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValueForFeet_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForFeet_shouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValuesAsZero_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_FEET);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(0.0);
        Assert.assertEquals(firstFeetValue, secondFeetValue, 0.0);
    }

    @Test
    public void givenTwoDifferentInchValuesAsZero_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_FEET);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(1.1);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValueForInch_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForInch_shouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetValueConvertToInch_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        double feetToInchConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(12.0, feetToInchConversion, 0.0);
    }

    @Test
    public void givenFeetValueConvertToYard_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_YARD);
        double feetToYardConversion = quantityMeasurement.getConversion(3.0);
        Assert.assertEquals(1.0, feetToYardConversion, 0.0);
    }
}
