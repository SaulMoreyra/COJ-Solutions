import java.util.Scanner;
public class eje3662
{
    public static void main(String [] ars){
        Scanner lee = new Scanner(System.in);
        while(true){
            int n = lee.nextInt();
            if(n==-1) break;
            
            if(n==6)
            System.out.println(n + " = 1 + 2 + 3");
            else if(n==28)
            System.out.println(n + " = 1 + 2 + 4 + 7 + 14");
            else if(n==496)
            System.out.println(n + " = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248");
            else if(n==8128)
            System.out.println(n + " = 1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064");
            else 
            System.out.println(n + " is NOT perfect.");
        }
        
    }
}
