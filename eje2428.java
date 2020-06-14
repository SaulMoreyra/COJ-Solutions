import java.util.Scanner;
public class eje2428
{
    public static void main(String [] args){
        int n=-1;
        Scanner lee = new Scanner(System.in);
        do{
            n= lee.nextInt();
            if(n!=0){
               double r = Math.ceil(Math.sqrt(n));
               System.out.println((int)(r));
            }
        }while(n!=0);
    }
}