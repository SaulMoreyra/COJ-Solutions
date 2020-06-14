import java.util.Scanner;
public class eje2620
{
    public static void main(String [] arg){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        if(x>0){
            String a = "a";
            String acum = "";
            for(int i=0; i<(x*4);i++){
                acum += a;
            }
            System.out.println("A"+acum+"h");
        }
    }
}
