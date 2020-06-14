import java.util.Scanner;
public class eje3137
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int ca = lee.nextInt();
            for(int i=0;i<ca;i++){
                int a = lee.nextInt();
                int b = lee.nextInt();
                int c = lee.nextInt();
                if(a==0 && b==0 && c!=0)
                    System.out.println("NO");
                else if((a+b)==c)
                    System.out.println("YES");
                else if((a-b)==c)
                    System.out.println("YES");
                else if((a*b)==c)
                    System.out.println("YES");
                else if(b==0)
                    System.out.println("NO"); 
                else if(a/b == c)
                    System.out.println("YES");
                else if((a%b)==c)
                    System.out.println("YES");
                else 
                    System.out.println("NO");                
            }
    }
}