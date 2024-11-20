package exam3;

public class main  {
    public static void main(String[] args) {

        Triagle triangle = new Triagle(10.0, 5.0);
        System.out.println("Triangle Details:");
        triangle.displayDimensions();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println();
        Rectangle rectangle = new Rectangle(8.0, 4.0);
        System.out.println("Rectangle Details:");
        rectangle.displayDimensions();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }

}
