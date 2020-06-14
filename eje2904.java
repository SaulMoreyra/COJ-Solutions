import java.util.Scanner;
import java.math.BigInteger;
public class eje2904
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        BigInteger acum = new BigInteger("0");
        for(int i=0;i<x;i++){
            BigInteger num = new BigInteger(lee.next());
            acum=acum.add(num);
        }
        System.out.println(acum);
    }
}
