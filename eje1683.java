import java.util.Scanner;
public class eje1683
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        for(int i=0;i<x;i++){
            int n = lee.nextInt();
            int acum=0;
            for(int j=1;j<n;j++){
                if(n%j==0){
                    acum += j;
                }
            }
            if(acum==n)
                System.out.println("Perfect");
            if(acum<n)
            System.out.println("Deficient");
            if(acum>n)
            System.out.println("Abundant");
        }
    }
}
