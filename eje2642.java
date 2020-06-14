import java.util.Scanner;
import java.math.BigInteger;
public class eje2642
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger n = new BigInteger("3");
        int x= Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            BigInteger big = new BigInteger(lee.nextLine(),2);
            if (big.mod(n)==BigInteger.ZERO) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}