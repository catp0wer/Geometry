
public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width=width;
        this.height = height;
    }
    public double getArea(){
        double area = width*height;
        System.out.println("Area of this rectangle is "+area);
        return area;
    }
}