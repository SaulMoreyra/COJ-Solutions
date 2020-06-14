import java.util.Scanner;
import java.math.BigInteger;
public class eje1395
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        for(int j=0;j<x;j++){
            int num = lee.nextInt();
            BigInteger fact = BigInteger.valueOf(1);
            for (int i = 1; i <= num; i++)
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println((fact+"").length());
        }
    }
}
