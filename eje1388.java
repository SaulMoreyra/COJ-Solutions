import java.util.Scanner;
import java.math.BigInteger;
public class eje1388
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        BigInteger a,b,r;
        for(int i=0; i<x; i++){
            a = new BigInteger(lee.nextInt()+"");
            b = new BigInteger(lee.nextInt()+"");
            r = a.modPow(b,new BigInteger(10+""));
            System.out.println(r.toString());
        }
    }
}
