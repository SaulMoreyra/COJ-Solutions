import java.util.Scanner;
import java.math.BigInteger;
public class eje1259
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x =Integer.parseInt(lee.nextLine());
        for(int i = 0; i < x; i++){
            BigInteger nu = new BigInteger(lee.nextLine());
            if(nu.mod(new BigInteger("11")).compareTo(BigInteger.ZERO) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
}
