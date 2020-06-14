import java.util.Scanner;
public class eje1180
{
    public static void main(String [] args){
        int [] p = {1,1,2,2,2,8};
        Scanner lee= new Scanner(System.in);
        int t = Integer.parseInt(lee.nextLine());
        for(int i=0; i<t; i++){
            String [] pi = lee.nextLine().split(" ");
            String s = "";
            for(int j=0; j<p.length; j++){
                if(j>0) s = " ";
                System.out.print(s + (p[j] - Integer.parseInt(pi[j])));
            }
            System.out.println();
        }
    }
}
