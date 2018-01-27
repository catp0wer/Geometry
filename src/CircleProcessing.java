
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
    public double getMin(double circleAreas[]){
        double min = circleAreas[0];
        for(int i=0;i<circleAreas.length;i++){
            if(min>circleAreas[i]){
                min= circleAreas[i];
            }
        }
        System.out.println("Min area is: " +min);
        return min;
    }

    public double getMax(double circleAreas[]){
        double max = circleAreas[0];
        for(int i=0;i<circleAreas.length;i++){
            if(max<circleAreas[i]){
                max= circleAreas[i];
            }
        }
        System.out.println("Max area is: " +max);
        return max;
    }


}