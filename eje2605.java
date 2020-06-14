import java.util.Scanner;
public class eje2605
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int [] a = {1,7,2,3};
        int x = lee.nextInt();
        System.out.println(a[x-1]);
    }
}