import java.util.Scanner;
public class eje3602
{
    public static void main(String [] args){
        String [] num = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        Scanner lee = new Scanner(System.in);
        String x = num[lee.nextInt()];
        System.out.println(x.length());
    }
}
