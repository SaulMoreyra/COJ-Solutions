import java.util.Scanner;
public class eje1078
{
    public static void main(String []args)
    {
         Scanner lee = new Scanner(System.in);
         int dulces,acum=0;
         int casos = lee.nextInt();
             for(int i=0;i<casos;i++){
                 String b = lee.nextLine();
                 int niños = lee.nextInt();
                     for(int j=0;j<niños;j++){
                         acum=acum+lee.nextInt();
                     }
                     if(acum%niños==0){
                         System.out.println("YES");
                     }else{
                         System.out.println("NO");
                     }
             }
        
    }
}
