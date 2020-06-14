import java.util.Scanner;
public class eje2693
{
    public static void main(String [] arg){
        Scanner lee = new Scanner(System.in);
        double numero = lee.nextDouble();
        int digitos = lee.nextInt();
        int cifras=(int) Math.pow(10,digitos);
        double x =  Math.rint(numero*cifras)/cifras;
        System.out.println(x);
    }
    
}
