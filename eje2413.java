import java.util.Scanner;
public class eje2413
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            String j = lee.nextLine();
            if(j.charAt(j.length()-1)=='0' || j.charAt(j.length()-1)=='5')
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
