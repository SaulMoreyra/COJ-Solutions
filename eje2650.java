import java.util.Scanner;
import java.text.DecimalFormat;
public class eje2650
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        float a = lee.nextFloat();
        float b = lee.nextFloat();
        double resu = 1-(b/a);
        System.out.println(String.format("%.2f", resu));
    }
}
