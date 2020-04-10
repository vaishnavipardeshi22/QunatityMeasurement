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
}
