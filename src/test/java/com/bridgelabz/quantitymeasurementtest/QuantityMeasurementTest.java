package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValueAsZero_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(0.0);
        Assert.assertEquals(firstFeetValue, secondFeetValue, 0.0);
    }

    @Test
    public void givenTwoDifferentFeet_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(1.1);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValueForFeet_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET);
        boolean result = quantityMeasurement.equals(null);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenReferenceForFeet_shouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET);
        boolean result = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTwoInchValuesAsZero_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(0.0);
        Assert.assertEquals(firstFeetValue, secondFeetValue, 0.0);
    }

    @Test
    public void givenTwoDifferentInchValuesAsZero_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH);
        double firstFeetValue = quantityMeasurement.getConversion(0.0);
        double secondFeetValue = quantityMeasurement.getConversion(1.1);
        Assert.assertNotEquals(firstFeetValue, secondFeetValue);
    }

    @Test
    public void givenNullValueForInch_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH);
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

    @Test
    public void givenFeetValueConvertToYard_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_YARD);
        double feetToYardConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertNotEquals(1.0, feetToYardConversion);
    }

    @Test
    public void givenInchValueConvertToYard_ShouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_YARD);
        double inchToYardConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertNotEquals(1.0, inchToYardConversion);
    }

    @Test
    public void givenYardValueConvertToInch_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.YARD_TO_INCH);
        double yardToInchConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(36.0, yardToInchConversion, 0.0);
    }

    @Test
    public void givenInchValueConvertToYard_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_YARD);
        double inchToYardConversion = quantityMeasurement.getConversion(36.0);
        Assert.assertEquals(1.0, inchToYardConversion, 0.0);
    }

    @Test
    public void givenYardValueConvertToFeet_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.YARD_TO_FEET);
        double yardToFeetConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(3.0, yardToFeetConversion, 0.0);
    }

    @Test
    public void givenInchValueToConvertToCentimeter_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_CENTIMETER);
        double inchToCentimeterConversion = quantityMeasurement.getConversion(2.0);
        Assert.assertEquals(5.0, inchToCentimeterConversion, 0.1);
    }

    @Test
    public void givenInchValueToConvertToCentimeter_shouldReturnNotEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH_TO_CENTIMETER);
        double inchToCentimeterConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertNotEquals(1.0, inchToCentimeterConversion);
    }

    @Test
    public void givenTwoInchLength_WhenAdd_ThenReturnResult() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.INCH);
        double firstLength = 2.0;
        double secondLength = 2.0;
        double additionResult = quantityMeasurement.getAddition(firstLength, secondLength);
        Assert.assertEquals(4.0, additionResult, 0.0);
    }

    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_ReturnResultInInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        double firstLength = quantityMeasurement.getConversion(1.0);
        double secondLength = 2.0;
        double additionResult = quantityMeasurement.getAddition(firstLength, secondLength);
        Assert.assertEquals(14.0, additionResult, 0.0);
    }

    @Test
    public void givenTwoFeetLength_WhenAdd_ThenReturnResultInInch() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FEET_TO_INCH);
        double firstLength = quantityMeasurement.getConversion(1.0);
        double secondLength = quantityMeasurement.getConversion(1.0);
        double additionResult = quantityMeasurement.getAddition(firstLength, secondLength);
        Assert.assertEquals(24.0, additionResult, 0.0);
    }

    @Test
    public void givenLengthInInchAndCentimeter_WhenAdd_ThenReturnResultInInch() {
        double firstLength = 2.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.CENTIMETER_TO_INCH);
        double secondLength = quantityMeasurement.getConversion(2.5);
        double additionResult = quantityMeasurement.getAddition(firstLength, secondLength);
        Assert.assertEquals(3.0, additionResult, 0.1);
    }

    @Test
    public void givenOneGallonVolumeConvertToLitres_ShouldReturnEquals() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.GALLON_TO_LITRES);
        double gallonToLitresConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(3.78, gallonToLitresConversion, 0.1);
    }

    @Test
    public void givenOneLitreVolumeConvertToMilliLitre_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.LITRE_TO_MILLILITRE);
        double litreToMillilitreConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(1000.0, litreToMillilitreConversion, 0.0);
    }

    @Test
    public void givenOneGallonAndOneLitreValue_WhenAdd_ShouldReturnResultInLitres() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.GALLON_TO_LITRES);
        double firstVolume = quantityMeasurement.getConversion(1.0);
        double secondVolume = 3.78;
        double additionResult = quantityMeasurement.getAddition(firstVolume, secondVolume);
        Assert.assertEquals(7.57, additionResult, 0.1);
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_WhenAdd_ShouldReturnResultInLitres() {
        double firstVolume = 1.0;
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.MILLILITRE_TO_LITRE);
        double secondVolume = quantityMeasurement.getConversion(1000.0);
        double additionResult = quantityMeasurement.getAddition(firstVolume, secondVolume);
        Assert.assertEquals(2.0, additionResult, 0.0);
    }

    @Test
    public void givenOneKilogramToConvertToGrams_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.KILOGRAM_TO_GRAM);
        double kilogramToGramConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(1000.0, kilogramToGramConversion, 0.0);
    }

    @Test
    public void givenOneTonneToConvertToKilogram_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.TONNE_TO_KILOGRAM);
        double tonneToKilogramConversion = quantityMeasurement.getConversion(1.0);
        Assert.assertEquals(1000.0, tonneToKilogramConversion, 0.0);
    }

    @Test
    public void givenTonneAndGram_WhenAdd_ShouldReturnResult_InKilogram() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.TONNE_TO_KILOGRAM);
        double firstWeight = quantityMeasurement.getConversion(1.0);
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(Unit.GRAM_TO_KILOGRAM);
        double secondWeight = quantityMeasurement1.getConversion(1000.0);
        double additionResult = quantityMeasurement.getAddition(firstWeight, secondWeight);
        Assert.assertEquals(1001.0, additionResult, 0.0);
    }

    @Test
    public void givenFahrenheitConvertToCelsius_ShouldReturnEqual() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(Unit.FAHRENHITE_TO_CELSIUS);
        double fahrenheitToCelsius = quantityMeasurement.getConversion(212.0);
        Assert.assertEquals(100.0, fahrenheitToCelsius, 0.0);
    }
}
