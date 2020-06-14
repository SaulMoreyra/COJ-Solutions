import java.util.Scanner;
public class eje1933
{
    public static void main(String [] args){
        String cad;
        String [] arre1;
        int [] arre = new int[2];
        Scanner lee = new Scanner(System.in);
        do{
            cad = lee.nextLine();
            arre1 = cad.split(" ");
            arre[0]=Integer.parseInt(arre1[0]);
            arre[1]=Integer.parseInt(arre1[1]);
            if(arre[0]==0 && arre[1]==0)break;
            else
            System.out.println(arre[0]+arre[1]);
        }while(arre[0]!=0 && arre[1]!=0);
    }
}
