public class MeasurementComparer {
    private final Unit unit;
    private final int value;

    MeasurementComparer(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeasurementComparer secondMeasurement = (MeasurementComparer) o;
        return this.convertToInches(this.value, this.unit) == secondMeasurement.convertToInches(secondMeasurement.value, secondMeasurement.unit);
    }

    private int convertToInches(int value, Unit unit) {
        if (unit.equals(Unit.FEET))
            return value * 12;
        return value;
    }

    public int add(MeasurementComparer measurementTwo) {
        return this.convertToInches(this.value, this.unit) + this.convertToInches(measurementTwo.value, measurementTwo.unit);
    }
}
