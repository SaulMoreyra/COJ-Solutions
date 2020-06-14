import java.util.Arrays;
import java.util.Scanner;
public class eje1485
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        char [] x = lee.nextLine().toCharArray();
        Arrays.sort(x);
        for(int i=0;i<x.length;i++)
            System.out.print(x[i]);
    }
}
