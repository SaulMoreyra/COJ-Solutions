import java.util.Scanner;
public class eje3051
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = lee.nextInt();
        for(int i=0;i<c;i++){
            int x = lee.nextInt();
            int y = lee.nextInt();
            
            double r = (double)x/y;
            
            System.out.printf("%.2f\n",r);
        }
    }
}