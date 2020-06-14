import java.util.Scanner;
public class eje2785
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        double a = 0;
        for(int i=0;i<x;i++){
            int aqu = lee.nextInt();
            a += aqu;
        }
        double p = (a/(double)(x));
        System.out.println(String.format("%.2f", p).replace(',', '.'));
        
    }
}
