import java.util.Scanner;
public class eje3053
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        double pi = 3.14;
        int c = lee.nextInt();
        for(int i=0;i<c;i++){
            int r = lee.nextInt();
            double opera = Math.pow(r,2)-(2*(Math.pow(r,2)-((pi*(Math.pow(r,2)))/4)));
            System.out.println(String.format("%.2f", opera));
        }
    }
}
