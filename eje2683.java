import java.util.Scanner;
import java.math.BigInteger;
public class eje2683
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int casos = lee.nextInt();
        for(int i=0; i<casos; i++){
            BigInteger x = new BigInteger(lee.nextInt()+"");
            System.out.println(x.toString(lee.nextInt()).toUpperCase());
        }
    }
}
