package shapesmain;

public class Triangle implements Shapes,Deformed {

    String name;
    protected double base;
    protected double height;
    protected double sideA;
    protected double sideB;

    public Triangle(String name, double base, double height, double sideA, double sideB) {
        this.name = name;
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double Area() {
        double totalArea = (0.5 * base * height);
        return totalArea;
    }

    @Override
    public double perimeter() {
        double totalPerimeter = ((sideA + sideB) + base);
        return totalPerimeter;

    }

    @Override
    public void deform() {
        System.out.println("Triange is deforming");
    }

}
