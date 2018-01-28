import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class Circle {
    private double radius;
    private double area;


    Circle(double radius) {
        this.radius = radius;
        System.out.println("Radius of the circle is " + radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius,2);
        System.out.printf("The radius of the circle is %.2f and area is %.4f ", radius, area);
        System.out.println();
        return area;
    }

    public void setArea(double area){
        this.area = area;
        this.radius = Math.sqrt(area/Math.PI);
    }


}

