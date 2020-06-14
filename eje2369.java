import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class eje2369
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int ca = lee.nextInt();
        for(int i=0; i<ca; i++){
            BigInteger a = new BigInteger(lee.nextInt()+"");
            BigInteger b = new BigInteger(lee.nextInt()+"");
            BigInteger c = new BigInteger(lee.nextInt()+"");
            BigInteger [] op = new BigInteger[6];
            op[0] = a.multiply(b.add(c));
            op[1] = b.multiply(a.add(c));
            op[2] = c.multiply(b.add(a));
            op[3] = a.add(b.multiply(c));
            op[4] = b.add(a.multiply(c));
            op[5] = c.add(b.multiply(a));
            Arrays.sort(op);
            System.out.println(op[0].toString()+" "+op[5].toString());
        }
    }
}
