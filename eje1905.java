/*import java.util.Scanner;
public class eje1905
{
    public static void main(String [] atgs){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int j=0; j<x; j++){
            String l = lee.nextLine();
            String [] c = l.split(" ");
            String na ="";
            for(int i = c.length-1; i>0; i--){
                if(i!=1)
                    na +=c[i]+"*";
                else 
                    na += c[i];
            }   
            String pass = c[0].charAt(0)+""+c[0].charAt(1)+na+c[0].charAt(2)+""+c[0].charAt(3);
            System.out.println(pass);
        }
    }
}
*/
import java.util.Scanner;
public class eje1905
{
    public static void main(String [] atgs){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0; i<x; i++){
            String l = lee.nextLine();
            String [] c = l.split(" ");
            String pass = c[0].charAt(0)+""+c[0].charAt(1)+c[3]+"*"+c[2]+"*"+c[1]+""+c[0].charAt(2)+""+c[0].charAt(3);
            System.out.println(pass);
        }
    }
}
