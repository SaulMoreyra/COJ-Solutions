import java.util.Scanner;
import java.math.BigInteger;
public class eje1288
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger big = new BigInteger("6");
        int x = lee.nextInt();
        for(int i =0; i<x; i++){
            BigInteger n = new BigInteger(lee.next());
            if (n.mod(big)==BigInteger.ZERO) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
