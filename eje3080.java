import java.util.Scanner;
public class eje3080
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = Integer.parseInt(lee.nextLine());
        for(int i=0; i<c; i++){
            int n1 = Integer.parseInt(lee.nextLine());
            String op = lee.nextLine();
            int n2 = Integer.parseInt(lee.nextLine());
            String ig = lee.nextLine();
            int r = Integer.parseInt(lee.nextLine());
            int opera=0;
            if(op.equals("+"))
                opera = n1+n2;
            else if(op.equals("-"))
                opera = n1-n2;
            else if(op.equals("*"))
                opera = n1*n2;
            else if(n2==0){
                System.out.println("No");
                break;
            }
            else if(op.equals("/"))
                opera = n1/n2;
            
            if(r == opera)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
