import java.util.Scanner;
public class eje2799
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int a = lee.nextInt();
        int b = lee.nextInt();
        int c = lee.nextInt();

        if((a+b+c)==180){
            if(a == b && b==c){
                System.out.println("Equilateral");
            }
            if((a==b && b!=c) || (b==c && c!=a) || (a==c && c!=b)){
                System.out.println("Isosceles");
            }
            if(a!=b && b!=c && c!=a){
                System.out.println("Scalene");
            }
        }else
            System.out.println("Error");

        for(int i=0; i<10; i++){

        }
    }
}
