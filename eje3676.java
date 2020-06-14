import java.util.Scanner;
import java.math.BigDecimal;
public class eje3676
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        BigDecimal div = new BigDecimal("5");
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            BigDecimal n =lee.nextBigDecimal();
            n=n.divide(div);
            System.out.println(String.format("Case "+(i+1)+": "+n).replace('.',','));
        }
    }
}