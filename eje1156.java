import java.util.Scanner;
import java.util.Arrays;
public class eje1156
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = 0;
        do{
            x = lee.nextInt();
            if(x==42) break;
            System.out.println(x);
            
        }while(x!=0);
    }
}