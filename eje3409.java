import java.util.Scanner;
public class eje3409
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        double resu = x*0.35;
        resu = resu*.10;
        System.out.println((int)(resu));
    }
}
