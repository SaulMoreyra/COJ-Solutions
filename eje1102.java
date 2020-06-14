import java.math.BigInteger;
import java.util.Scanner;
public class eje1102
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger once = new BigInteger("11");
        BigInteger entra = new BigInteger("0");
        do{
            entra = new BigInteger(lee.next());
            if(entra.compareTo(BigInteger.ZERO)==0) break;
            if(entra.mod(once)==BigInteger.ZERO)
                System.out.println(entra+" is a multiple of 11.");
            else
                System.out.println(entra+ " is not a multiple of 11.");     
        }while(entra.compareTo(BigInteger.ZERO)!=0);
    }
}