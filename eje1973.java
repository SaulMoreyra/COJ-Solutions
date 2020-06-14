import java.util.Scanner;
import java.math.BigInteger;
public class eje1973
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger bigBin = new BigInteger(lee.nextLine(),2);
        BigInteger ds = new BigInteger("17");
        BigInteger op = bigBin.multiply(ds);
        System.out.println(op.toString(2));
    }
}