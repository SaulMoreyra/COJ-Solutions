import java.util.Arrays;
import java.util.Scanner;
public class eje3473
{
    public static void main(String [] arfs){
        Scanner lee = new Scanner(System.in);
        int [] x = new int[4];
        for(int i=0; i<4; i++){
            x[i]=lee.nextInt();
        }
        Arrays.sort(x);
        if(x[0]==90 && x[1]==90 && x[2]==90 && x[3]==90)
            System.out.println("none of the previous");
        else if(x[0]==x[1] && x[2]==x[3])
            System.out.println("isosceles");
        else if(x[0]==90 && x[1]==90 || x[1]==90 && x[2]==90 || x[2]==90 && x[3]==90)
            System.out.println("right");
        else
            System.out.println("none of the previous");
    }    
}