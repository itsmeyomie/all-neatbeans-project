
 
package shapesmain;


public class Circle implements Shapes,Deformed {

     @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


   String name;
protected double radius;
final double pi=3.14;

    public Circle( String name,double radius) {
     
        this.radius = radius;
    }

public void setRadius(double radius){
 this.radius=radius;
 
}
public double getRadius(){
  return radius;
  
}




    @Override
    public double Area() {
        
       double totalArea=(pi*(radius*radius)); 
       
       return totalArea;
     
    }

    @Override
    public double perimeter() {
        
       double per=(2*(pi)*radius);
      return per;
    }

    @Override
    public void deform() {
        System.out.println("Circle is deforming");
    }
    
    
    
}
