import java.util.Scanner;
public class eje2420
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            String b = Integer.toBinaryString(lee.nextInt());
            String aux = new StringBuilder(b).reverse().toString();
            if(b.equalsIgnoreCase(aux))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }   
}
