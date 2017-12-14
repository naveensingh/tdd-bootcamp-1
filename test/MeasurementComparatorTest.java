import org.junit.Assert;
import org.junit.Test;

public class MeasurementComparatorTest {

    @Test
    public void verifyIfTwoFeetAndTwoFeetAreEqual() {
        MeasurementComparer measurementOne = new MeasurementComparer(2, Unit.FEET);
        MeasurementComparer measurementTwo = new MeasurementComparer(2, Unit.FEET);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void verifyIfTwoInchesAndTwoInchesAreEqual() {
        MeasurementComparer measurementOne = new MeasurementComparer(2, Unit.INCH);
        MeasurementComparer measurementTwo = new MeasurementComparer(2, Unit.INCH);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfOneFeetEqualsToTwelveInch() {
        MeasurementComparer measurementOne = new MeasurementComparer(1, Unit.FEET);
        MeasurementComparer measurementTwo = new MeasurementComparer(12, Unit.INCH);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfOneInchNotEqualsToTwelveFeet() {
        MeasurementComparer measurementOne = new MeasurementComparer(1, Unit.INCH);
        MeasurementComparer measurementTwo = new MeasurementComparer(12, Unit.FEET);
        Assert.assertNotEquals(measurementOne, measurementTwo);
    }

    @Test
    public void verifyIfTwoFeetAndTwentyFourInchesAreEqual() {
        MeasurementComparer measurementOne = new MeasurementComparer(2, Unit.FEET);
        MeasurementComparer measurementTwo = new MeasurementComparer(24, Unit.INCH);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void verifyIfTwoFeetAndTwoFeetIsFourtyEightInch() {
        MeasurementComparer measurementOne = new MeasurementComparer(2, Unit.FEET);
        MeasurementComparer measurementTwo = new MeasurementComparer(2, Unit.FEET);
        Assert.assertEquals(new MeasurementComparer(48, Unit.INCH), new MeasurementComparer(measurementOne.add(measurementTwo), Unit.INCH));
    }
    @Test
    public void verifyIfTwoFeetAndTwentyInchesIsFourtyFourInches() {
        MeasurementComparer measurementOne = new MeasurementComparer(2, Unit.FEET);
        MeasurementComparer measurementTwo = new MeasurementComparer(20, Unit.INCH);
        Assert.assertEquals(new MeasurementComparer(44, Unit.INCH), new MeasurementComparer(measurementOne.add(measurementTwo), Unit.INCH));
    }

}
