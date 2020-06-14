import java.text.DecimalFormat;
import java.util.Scanner;
public class eje1538
{
   public static void main(String []args){
    Scanner lee=new Scanner(System.in);
    int c =lee.nextInt();
    int i,j;
    double prom=0,sum=0;
    DecimalFormat formatea = new DecimalFormat("$###,###,###,###.##");
    for(i=1;i<=c;i++){
      
        for(j=0;j<12;j++){
            sum=sum+ Double.valueOf(lee.next());
         prom=sum/12;
        }
        System.out.println(i+" "+formatea.format(prom));
    }
    
    }
}
