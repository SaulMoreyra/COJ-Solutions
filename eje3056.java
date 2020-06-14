import java.util.Scanner;
public class eje3056
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String x = lee.nextLine();
        String y = lee.nextLine();
        int n1 = Integer.parseInt(x.replace(" ",""));
        int n2 = Integer.parseInt(y.replace(" ",""));
        int r=n1+n2;
        if(r==11111){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
