
public class TestFigures {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        circle1.getArea();
        circle1.setArea(40.6885);
        System.out.println("Set area is " +circle1.getArea());
        System.out.println("The calculated radius  is "+circle1.getRadius());
        int number = 10;

        Circle myArray[] = createCircle(number);
        CircleProcessing circlePro = new CircleProcessing();
        double myArrayAreas[] = circlePro.getAreas(myArray);
        circlePro.getMin(myArrayAreas);
        circlePro.getMax(myArrayAreas);

        Rectangle rectangle = new Rectangle(10, 4);
        rectangle.getArea();

        Square square = new Square(2);
        square.setArea(25);
        System.out.println("The set area is :"+square.getArea());
        System.out.println("The calclated width is "+square.getWidth());
    }

    private static Circle[] createCircle(int n) {
        Circle myArray[] = new Circle[n];
        for (int i = 0; i < myArray.length; i++) {
            Circle circ = new Circle(Math.random() * 9);
            myArray[i] = circ;
        }return myArray;

    }



}
