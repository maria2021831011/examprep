package exam3;

public class Rectangle extends Area<Double> {

    public Rectangle(Double base, Double height) {
        super(base, height);
    }


    @Override
    public double calculateArea() {
        return base.doubleValue() * height.doubleValue();
    }


    @Override
    public void displayDimensions() {
        super.displayDimensions();
        System.out.println("Shape: Rectangle");
    }
}

