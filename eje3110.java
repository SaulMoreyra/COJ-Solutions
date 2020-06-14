import java.util.Scanner;
public class eje3110
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int n = lee.nextInt();
        n = 2*n;
        if(n%3==1)
            System.out.print("1");
        else if(n%3==2)
            System.out.print("3");
        
        int v = n/3;
        for(int i=0; i<v ;i++){
            System.out.print("7");
        }
        System.out.print("\n");
    }
}
