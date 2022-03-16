package shapesmain;

public class Rectangles implements Shapes{
         String name;
    protected double length;
    protected double width;

    public Rectangles(String name, double length, double width) {
        this.name=name;
        this.length = length;
        this.width = width;
    }

  

   

    public void setlength(double length) {
        this.length = length;

    }

    public double getLength() {
        return length;

    }

    public void setWidth(double width) {
        this.width = width;

    }

    public double getWidth() {
        return width;
    }

    @Override
    public double Area() {
        double totalArea = (length * width);
        return totalArea;
    }

    @Override
    public double perimeter() {
        double totalPerimeter = (2 * (length + width));

        return totalPerimeter;
    }

      @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
