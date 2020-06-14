import java.util.Scanner;
public class eje1626
{   
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = lee.nextInt();
        for(int i=0;i<c;i++){
            int a = lee.nextInt();
            int b = lee.nextInt();
            String a1 = new StringBuilder(a+"").reverse().toString();
            String b1 = new StringBuilder(b+"").reverse().toString();
            int s = Integer.parseInt(a1)+Integer.parseInt(b1);
            String s1 = new StringBuilder(s+"").reverse().toString();
            System.out.println(Integer.parseInt(s1));
        }  
    }    
}
