import java.math.*;
import java.util.Scanner;
public class eje2731
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = Integer.parseInt(lee.nextLine());
        for(int i =0; i<c; i++){
            double x= Double.parseDouble(lee.nextLine());
            double r = (double)(Math.pow(x,2))-(double)(Math.PI*(Math.pow((x/2),2)));
            
            System.out.printf("%.2f\n",r);
        }
    }
}
