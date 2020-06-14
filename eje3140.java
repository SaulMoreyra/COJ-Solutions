import java.util.Scanner;
import java.util.Arrays;
public class eje3140
{
    public static void main(String [] args){    
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        int [] arre = new int[x];
        for(int i=0;i<x;i++){
            arre[i]=lee.nextInt();
        }
        Arrays.sort(arre);
        for(int i=0;i<x;i++){
            System.out.println(arre[i]);
        }
    }
}
