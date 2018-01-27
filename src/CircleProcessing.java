
import java.util.Arrays;
public class CircleProcessing {

    public double[] getAreas(Circle myArray[]){
        double circleAreas[] = new double[myArray.length];
        for(int i=0;i<myArray.length;i++){
            circleAreas[i]=myArray[i].getArea();
        }
        System.out.println(Arrays.toString(circleAreas));
       // System.out.printf("The sum is %.2f ",sum);
        return circleAreas;
    }

}
