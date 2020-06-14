import java.util.*;
public class eje2789
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String [] x = lee.nextLine().replace("+","/").split("/");
        Arrays.sort(x);
        for(int i=0; i<x.length;i++){
            if(i==0)    System.out.print(x[0]);
            else
                System.out.print("+"+x[i]);
            
        }
    }
}
