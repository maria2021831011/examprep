package exam3;

class Area<T extends Number> {
    public T base;
    public T height;
    public Area(T base, T height) {
        this.base = base;
        this.height = height;
    }
    public Area() {
        this.base = null;
        this.height = null;
    }
    public void displayDimensions() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }

    public double calculateArea() {
        return 0;
    }
}


