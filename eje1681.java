import java.util.Scanner;
import java.math.*;
public class eje1681
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String x = lee.nextLine();
        String [] aux = x.split(" ");
        int a = Integer.parseInt(aux[0]);
        int b = Integer.parseInt(aux[1]);
        int c = Integer.parseInt(aux[2]);
        int resu = (((int)Math.pow(b,2))-(4*a*c));
        if(resu>=0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
