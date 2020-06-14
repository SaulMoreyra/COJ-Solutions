import java.util.Scanner;
import java.math.BigInteger;
public class eje1176
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        while(true){
            String c = lee.nextLine();
            if(c.equals("-1"))
            break;
            
            BigInteger tri = new BigInteger(c);
            System.out.println(tri.toString(3));
        }
        
    }
}
