import java.util.Scanner;
public class eje2399
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        int y = lee.nextInt();
        
        int op = (x*y)-(x-1);
        System.out.println(op);
    }
}
