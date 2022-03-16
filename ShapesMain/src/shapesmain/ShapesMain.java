package shapesmain;

import java.util.ArrayList;

public class ShapesMain {

    public static void main(String[] args) {
        Deformed circle2 = new Circle("circle2", 7.5);
        Deformed triangle2 = new Triangle("triangle2", 7, 12, 18, 9);

        Shapes circle1 = new Circle("circle1", 7.21);
        Shapes rectangle1 = new Rectangles("rectangle1", 4, 7);
        Shapes square1 = new Square("square1", 5);
        Shapes triangle1 = new Triangle("triangle1", 6, 8, 9, 12);

        ArrayList<Shapes> ShapesList = new ArrayList<>();
        ShapesList.add(circle1);
        ShapesList.add(rectangle1);
        ShapesList.add(square1);
        ShapesList.add(triangle1);

        ArrayList<Deformed> deformedList = new ArrayList<>();

        deformedList.add((Deformed) circle1);
        deformedList.add(triangle2);

        for (Shapes currentShapes : ShapesList) {

            System.out.println("The current shape is a " + currentShapes.getName() + " with an Area of:" + currentShapes.perimeter());
            System.out.println("The current shape is a " + currentShapes.getName() + " with an Perimeter of:" + currentShapes.Area());

        }
        for (Deformed newDeformed : deformedList) {
            newDeformed.deform();
           
        }

    }

}
