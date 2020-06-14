import java.util.Scanner;
public class eje3490
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = lee.nextInt();
        for(int i=0;i<c;i++){
            int x = lee.nextInt();
            int y = lee.nextInt();
            
            int r = y/x;
            
            System.out.println(y-r);
        }
    }
}
