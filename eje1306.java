import java.util.Scanner;
public class eje1306
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        for(int i=0; i<x;i++){
            int y = lee.nextInt();
            if(y!=0){
                if(y%4==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");            
                }
            }
        }
    }
}
