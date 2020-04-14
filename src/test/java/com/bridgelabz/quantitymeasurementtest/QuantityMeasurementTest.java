package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoFeetValueAsZero_ShouldReturnEqual() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.FEET, 0.0);
        Assert.assertEquals(firstQuantity, secondQuantity);
    }

    @Test
    public void givenTwoDifferentFeet_ShouldReturnFalse() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.FEET, 1.0);
        boolean equalityCheck = firstQuantity.equals(secondQuantity);
        Assert.assertFalse(equalityCheck);
    }

    @Test
    public void givenNullValueForFeet_shouldReturnFalse() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.FEET, null);
        boolean equalityCheck = firstQuantity.equals(secondQuantity);
        Assert.assertFalse(equalityCheck);
    }

    @Test
    public void givenTwoInchValuesAsZero_ShouldReturnEqual() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.INCH, 0.0);
        Assert.assertEquals(firstQuantity, secondQuantity);
    }

    @Test
    public void givenTwoDifferentInchValuesAsZero_ShouldReturnNotEqual() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.INCH, 1.0);
        boolean equalityCheck = firstQuantity.equals(secondQuantity);
        Assert.assertFalse(equalityCheck);
    }

    @Test
    public void givenNullValueForInch_shouldReturnFalse() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.INCH, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.INCH, null);
        boolean equalityCheck = firstQuantity.equals(secondQuantity);
        Assert.assertFalse(equalityCheck);
    }

    @Test
    public void givenFeetAndInchValue_ShouldReturn_UnitNotEqual() {
        QuantityMeasurement feetValue = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement inchValue = new QuantityMeasurement(Length.INCH, 0.0);
        boolean equalityCheck = false;
        try {
            equalityCheck = feetValue.compareUnit(inchValue);
            Assert.assertTrue(equalityCheck);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenFeetValueConvertToInch_ShouldReturnEqual() {
        double feetToInchConversion = Length.FEET_TO_INCH.getConversionValue(1.0);
        Assert.assertEquals(12.0, feetToInchConversion, 0.0);
    }

    @Test
    public void givenFeetValueConvertToYard_ShouldReturnEqual() {
        double feetToYardConversion = Length.FEET_TO_YARD.getConversionValue(3.0);
        Assert.assertEquals(1.0, feetToYardConversion, 0.0);
    }

    @Test
    public void givenFeetValueConvertToYard_ShouldReturnNotEqual() {
        double feetToYardConversion = Length.FEET_TO_YARD.getConversionValue(1.0);
        Assert.assertNotEquals(1.0, feetToYardConversion);
    }

    @Test
    public void givenInchValueConvertToYard_ShouldReturnNotEqual() {
        double inchToYardConversion = Length.INCH_TO_YARD.getConversionValue(1.0);
        Assert.assertNotEquals(1.0, inchToYardConversion);
    }

    @Test
    public void givenYardValueConvertToInch_ShouldReturnEqual() {
        double yardToInchConversion = Length.YARD_TO_INCH.getConversionValue(1.0);
        Assert.assertEquals(36.0, yardToInchConversion, 0.0);
    }

    @Test
    public void givenInchValueConvertToYard_ShouldReturnEqual() {
        double inchToYardConversion = Length.INCH_TO_YARD.getConversionValue(36.0);
        Assert.assertEquals(1.0, inchToYardConversion, 0.0);
    }

    @Test
    public void givenYardValueConvertToFeet_ShouldReturnEqual() {
        double yardToFeetConversion = Length.YARD_TO_FEET.getConversionValue(1.0);
        Assert.assertEquals(3.0, yardToFeetConversion, 0.0);
    }

    @Test
    public void givenInchValueToConvertToCentimeter_ShouldReturnEqual() {
        double inchToCentimeterConversion = Length.INCH_TO_CENTIMETER.getConversionValue(2.0);
        Assert.assertEquals(5.0, inchToCentimeterConversion, 0.1);
    }

    @Test
    public void givenInchValueToConvertToCentimeter_shouldReturnNotEqual() {
        double inchToCentimeterConversion = Length.INCH_TO_CENTIMETER.getConversionValue(1.0);
        Assert.assertNotEquals(1.0, inchToCentimeterConversion);
    }

    @Test
    public void givenTwoInchLength_WhenAdd_ThenReturnResult() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.INCH, 2.0);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(4.0, additionResult, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenOneFeetAndTwoInchValue_WhenAdd_ReturnResultInInch() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET_TO_INCH, 1.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.INCH, 2.0);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(14.0, additionResult, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenTwoFeetLength_WhenAdd_ThenReturnResultInInch() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET_TO_INCH, 1.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.FEET_TO_INCH, 1.0);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(24.0, additionResult, 0.0);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenLengthInInchAndCentimeter_WhenAdd_ThenReturnResultInInch() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.INCH, 2.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Length.CENTIMETER_TO_INCH, 2.5);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(3.0, additionResult, 0.1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenOneGallonVolumeConvertToLitres_ShouldReturnEquals() {
        double gallonToLitresConversion = Volume.GALLON_TO_LITRES.getConversionValue(1.0);
        Assert.assertEquals(3.78, gallonToLitresConversion, 0.1);
    }

    @Test
    public void givenOneLitreVolumeConvertToMilliLitre_ShouldReturnEqual() {
        double litreToMillilitreConversion = Volume.LITRE_TO_MILLILITRE.getConversionValue(1.0);
        Assert.assertEquals(1000.0, litreToMillilitreConversion, 0.0);
    }

    @Test
    public void givenOneGallonAndOneLitreValue_WhenAdd_ShouldReturnResultInLitres() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Volume.GALLON_TO_LITRES, 1.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Volume.LITRE, 3.78);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(7.57, additionResult, 0.1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenOneLitreAndOneMillilitreValue_WhenAdd_ShouldReturnResultInLitres() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Volume.MILLILITRE_TO_LITRE, 1000.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Volume.LITRE, 1.0);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(2.0, additionResult, 0.1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenOneKilogramToConvertToGrams_ShouldReturnEqual() {
        double kilogramToGramConversion = Weight.KILOGRAM_TO_GRAM.getConversionValue(1.0);
        Assert.assertEquals(1000.0, kilogramToGramConversion, 0.0);
    }

    @Test
    public void givenOneTonneToConvertToKilogram_ShouldReturnEqual() {
        double tonneToKilogramConversion = Weight.TONNE_TO_KILOGRAM.getConversionValue(1.0);
        Assert.assertEquals(1000.0, tonneToKilogramConversion, 0.0);
    }

    @Test
    public void givenTonneAndGram_WhenAdd_ShouldReturnResult_InKilogram() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Weight.TONNE_TO_KILOGRAM, 1.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Weight.GRAM_TO_KILOGRAM, 1000.0);
        double additionResult = 0.0;
        try {
            additionResult = firstQuantity.unitAddition(secondQuantity);
            Assert.assertEquals(1001.0, additionResult, 0.1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }

    @Test
    public void givenOneCelsiusAndOneCelsius_ShouldReturnEqualTemperature() {
        TemperatureConverter firstQuantity = new TemperatureConverter(Temperature.CELSIUS, 1.0);
        TemperatureConverter secondQuantity = new TemperatureConverter(Temperature.CELSIUS, 1.0);
        Assert.assertEquals(firstQuantity, secondQuantity);
    }

    @Test
    public void givenOneFahrenheitAndOneFahrenheit_ShouldReturnEqualTemperature() {
        TemperatureConverter firstQuantity = new TemperatureConverter(Temperature.FAHRENHEIT, 1.0);
        TemperatureConverter secondQuantity = new TemperatureConverter(Temperature.FAHRENHEIT, 1.0);
        Assert.assertEquals(firstQuantity, secondQuantity);
    }

    @Test
    public void givenFahrenheitConvertToCelsius_ShouldReturnEqual() {
        TemperatureConverter firstQuantity = new TemperatureConverter(Temperature.FAHRENHEIT, 212.0);
        TemperatureConverter secondQuantity = new TemperatureConverter(Temperature.CELSIUS, 100.0);
        boolean equalityCheck = firstQuantity.compareUnit(secondQuantity);
        Assert.assertTrue(equalityCheck);
    }

    @Test
    public void givenCelsiusConvertToFahrenheit_ShouldReturnEqual() {
        TemperatureConverter firstQuantity = new TemperatureConverter(Temperature.CELSIUS, 100.0);
        TemperatureConverter secondQuantity = new TemperatureConverter(Temperature.FAHRENHEIT, 212.0);
        boolean equalityCheck = firstQuantity.compareUnit(secondQuantity);
        Assert.assertTrue(equalityCheck);
    }

    @Test
    public void givenLengthAndVolume_WhenAdd_ThenThrowException() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET, 2.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Volume.LITRE, 2.0);
        try {
            double additionResult = firstQuantity.unitAddition(secondQuantity);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NO_ADDITION_POSSIBLE, e.type);
        }
    }

    @Test
    public void givenLengthAndVolumeUnit_ShouldThrowException() {
        QuantityMeasurement firstQuantity = new QuantityMeasurement(Length.FEET, 0.0);
        QuantityMeasurement secondQuantity = new QuantityMeasurement(Volume.LITRE, 0.0);
        try {
            boolean equalityCheck = firstQuantity.compareUnit(secondQuantity);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.UNIT_NOT_EQUAL, e.type);
        }
    }
}
