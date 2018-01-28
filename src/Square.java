
public class Square {

    private double width;
    private double area;

    public Square(double width) {
        this.width = width;

    }

    public double getArea(){
       double area = width*width;
        return area;
    }

    public void setArea(double area){
        this.area = area;
        this.width = Math.sqrt(area);
    }

    public double getWidth(){
        return this.width;
    }
}
