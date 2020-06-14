import java.util.Scanner;
import java.math.BigInteger;
public class eje3475
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String [] aux = lee.nextLine().split(" ");
        BigInteger a = new BigInteger(aux[0]);
        BigInteger b = new BigInteger(aux[1]);
       
        a = a.multiply(b);
        System.out.println(a.toString());
    }    
}