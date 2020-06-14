import java.util.Scanner;
public class eje2115
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String [] x;
        while(lee.hasNext()){
            x = lee.nextLine().split(" ");
            double r = (double)(Integer.parseInt(x[0]))/(double)(Integer.parseInt(x[1]));
            System.out.println(String.format("%.2f", r));
        }
    }
}