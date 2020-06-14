
import java.util.Scanner;
public class eje1417
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        do{
            double n = lee.nextDouble();
            if(n==0.0) break;
            
            int c=0;
            System.out.printf("Starting height: %.5f meter(s)\n",n);
            while(n>(double)(1.0/1000)){
                c+=1;
                n = n/2;
                System.out.printf("Bounce #%d: %.10f meters\n",c,n);
            }
            System.out.print("\n");
        }while(true);
    }
}