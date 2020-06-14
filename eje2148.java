import java.util.Scanner;
import java.math.*;
public class eje2148
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int y = lee.nextInt();
        for(int i=0;i<y;i++){
            int a = lee.nextInt();
            int b = lee.nextInt();
            int c = lee.nextInt();
            int resu = (((int)Math.pow(b,2))-(4*a*c));
            if(resu>=0)
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
    }