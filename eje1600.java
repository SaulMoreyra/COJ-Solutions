import java.util.Scanner;
import java.math.BigInteger;
public class eje1600
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigInteger n, m;
        BigInteger mod = new BigInteger("10");
        do{
            String cad = lee.nextLine();
            String [] aux = cad.split(" ");
            n = new BigInteger(aux[0]);
            m = new BigInteger(aux[1]);
            if(n.compareTo(BigInteger.ZERO)==0 && m.compareTo(BigInteger.ZERO)==0) break;
            else{
                System.out.println(n.modPow(m,mod));
            }     
        }while(n.compareTo(BigInteger.ZERO)!=0);
    }
    
}

