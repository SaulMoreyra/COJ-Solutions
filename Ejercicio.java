import java.util.Scanner;
import java.lang.Math;
public class Ejercicio
{
    public static void main(String [] args){
        int n=0;
        Scanner lee = new Scanner(System.in);
        n = Integer.parseInt(lee.nextLine());
        int p = (int) Math.pow(10,5);
        int x=0;
        if(n>0 && n<p){
            for(int i =0; i<=n;i++){
                x+=i;
            }
            System.out.println(x);
        }
    }
}
