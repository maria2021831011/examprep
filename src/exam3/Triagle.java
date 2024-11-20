package exam3;

public class Triagle extends Area<Double> {
    public Triagle(Double base, Double height) {
        super(base, height);
    }
    @Override
    public double calculateArea() {
        return 0.5 * base.doubleValue() * height.doubleValue();
    }
    @Override
    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("Shape: Triangle");
    }
}


