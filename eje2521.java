import java.util.Scanner;
public class eje2521
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        while(lee.hasNext()){
            int a = lee.nextInt();
            int b = lee.nextInt();
            int c = lee.nextInt();
            
            if(a==b && b==c){
                System.out.println("*");
            }
            if(a!=b && a!=c){
                System.out.println("A");
            }
            if(b!=a && b!=c){
                System.out.println("B");
            }
            if(c!=b && c!=a){
                System.out.println("C");
            }
        }   
    }
}
