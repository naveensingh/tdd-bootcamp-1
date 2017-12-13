import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MeasurementComparatorTest {

    @Test
    public void VerifyIfMeasurementIsSameWhenFirstMeasurementValueIsTwoAndSecondMeasurementValueIsTwo() {
        MeasurementComparer measurementComparer = new MeasurementComparer();
        boolean comparisonResult = measurementComparer.compareTwoMeasurements(2, 2);
        assertEquals(true, comparisonResult);
    }
    @Test
    public void VerifyIfMeasurementIsSameWhenFirstMeasurementValueIsFourAndSecondMeasurementValueIsFour() {
        MeasurementComparer measurementComparer = new MeasurementComparer();
        boolean comparisonResult = measurementComparer.compareTwoMeasurements(4, 4);
        assertEquals(true, comparisonResult);
    }
    @Test
    public void VerifyIfMeasurementIsNotSameWhenFirstMeasurementValueIsTwoAndSecondMeasurementValueIsThree() {
        MeasurementComparer measurementComparer = new MeasurementComparer();
        boolean comparisonResult = measurementComparer.compareTwoMeasurements(2, 3);
        assertEquals(false, comparisonResult);
    }
}
