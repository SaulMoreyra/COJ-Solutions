import java.util.Scanner;
import java.math.BigInteger;
public class eje1293
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger base = new BigInteger("2");
        int expo = lee.nextInt();
        BigInteger resu = base.pow(expo);
        System.out.println(resu);
    }
}
