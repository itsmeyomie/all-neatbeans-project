package shapesmain;

public class Square implements Shapes {
    String name;

    

    protected double length;

    public void setlength(double length) {
        this.length = length;

    }

    public double getLength() {
        return length;

    }

    @Override
    public double Area() {
        double totalArea = (length * length);
        return totalArea;
    }

    @Override
    public double perimeter() {
        double totalPerimeter = (length * 4);
        return totalPerimeter;
    }

    public Square(String name, double length) {
        this.name=name;
        this.length = length;
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
    

  

   

