import java.util.Scanner;
public class eje2458
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        long x=0;
        do{
            x = lee.nextLong();
            if(x==0) break;
            double r = Math.sqrt((x*2)-1);
            System.out.println(Math.round(r));
        }while(x!=0);
    }
}
