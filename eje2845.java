import java.util.Scanner;
public class eje2845
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        while(true){
            double x = lee.nextDouble();
            double y = lee.nextDouble();
            
            if(x == 0.0 && y == 0.0){
                System.out.println("AXIS");
                break;
            }else{
                if(x == 0.0 || y == 0.0) System.out.println("AXIS");
                else if(x > 0.0 && y > 0.0) System.out.println("Q1");
                else if(x < 0.0 && y > 0.0) System.out.println("Q2");
                else if(x < 0.0 && y < 0.0) System.out.println("Q3");
                else if( x > 0.0 && y <0.0) System.out.println("Q4");
            }
        }
    }
}
