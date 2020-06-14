import java.math.BigInteger;
import java.util.Scanner;
public class eje2152
{
    public static void main(String [] args){
            Scanner lee = new Scanner(System.in);
            int x = Integer.parseInt(lee.nextLine());
            for(int i=0;i<x;i++){
                String cad=lee.nextLine().replace("-","");
                    BigInteger c = new BigInteger("0");
                    for(int j=0;j<cad.length();j++){
                        c=c.add(new BigInteger(cad.charAt(j)+""));                
                    }
                    System.out.println(c);
            }
        
    }
}
