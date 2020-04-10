package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    @Test
    public void givenFeet_ShouldEqual() {
        double actualFeetValue = quantityMeasurement.getFeetValue(1.0);
        Assert.assertEquals(1.0, actualFeetValue, 0.0);
    }

    @Test
    public void givenFeet_ShouldNotEqual() {
        double actualFeetValue = quantityMeasurement.getFeetValue(1.0);
        Assert.assertNotEquals(2.0, actualFeetValue);
    }

    @Test
    public void givenTwoFeetValueAsZero_ShouldEqual() {
        double firstFeetValue = quantityMeasurement.getFeetValue(0.0);
        double secondFeetValue = quantityMeasurement.getFeetValue(0.0);
        Assert.assertEquals(firstFeetValue, secondFeetValue, 0.0);
    }

    @Test
    public void givenTwoDifferentFeet_ShouldNotEqual() {
        double firstFeetValue = quantityMeasurement.getFeetValue(0.0);
        double secondFeetValue = quantityMeasurement.getFeetValue(1.0);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValue_shouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReference_shouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }
}
