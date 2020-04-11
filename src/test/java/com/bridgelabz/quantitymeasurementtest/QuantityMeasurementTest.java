package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValueAsZero_ShouldReturnEqual() {
        QuantityMeasurement firstFeetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET_VALUE);
        QuantityMeasurement secondFeetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET_VALUE);
        Assert.assertEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenTwoDifferentFeet_ShouldReturnNotEqual() {
        QuantityMeasurement firstFeetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET_VALUE);
        QuantityMeasurement secondFeetValue = new QuantityMeasurement(1.1, QuantityMeasurement.Unit.FEET_VALUE);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValueForFeet_shouldReturnFalse() {
        QuantityMeasurement firstFeetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET_VALUE);
        QuantityMeasurement secondFeetValue = null;
        boolean result = firstFeetValue.equals(secondFeetValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForFeet_shouldReturnFalse() {
        QuantityMeasurement feetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.FEET_VALUE);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = feetValue.equals(quantityMeasurement);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenTwoInchValuesAsZero_ShouldReturnEqual() {
        QuantityMeasurement firstInchValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH_VALUE);
        QuantityMeasurement secondInchValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH_VALUE);
        Assert.assertEquals(firstInchValue, secondInchValue);
    }

    @Test
    public void givenTwoDifferentInchValuesAsZero_ShouldReturnNotEqual() {
        QuantityMeasurement firstInchValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH_VALUE);
        QuantityMeasurement secondInchValue = new QuantityMeasurement(1.0, QuantityMeasurement.Unit.INCH_VALUE);
        Assert.assertNotEquals(firstInchValue, secondInchValue);
    }

    @Test
    public void givenNullValueForInch_shouldReturnFalse() {
        QuantityMeasurement firstFeetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH_VALUE);
        QuantityMeasurement secondFeetValue = null;
        boolean result = firstFeetValue.equals(secondFeetValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForInch_shouldReturnFalse() {
        QuantityMeasurement feetValue = new QuantityMeasurement(0.0, QuantityMeasurement.Unit.INCH_VALUE);
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean result = feetValue.equals(quantityMeasurement);
        Assert.assertEquals(false, result);
    }
}
