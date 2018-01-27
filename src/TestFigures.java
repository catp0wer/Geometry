import java.lang.reflect.Array;
import java.util.Arrays;

public class TestFigures {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        circle1.getArea();
        int number = 10;

        Circle myArray[] = createCircle(number);
        CircleProcessing circlePro = new CircleProcessing();
        double myArrayAreas[] = circlePro.getAreas(myArray);
        circlePro.getMin(myArrayAreas);
        circlePro.getMax(myArrayAreas);

        Rectangle rectangle = new Rectangle(10, 4);
        rectangle.getArea();
    }

    private static Circle[] createCircle(int n) {
        Circle myArray[] = new Circle[n];
        for (int i = 0; i < myArray.length; i++) {
            Circle circ = new Circle(Math.random() * 9);
            myArray[i] = circ;
        }return myArray;

    }
}
