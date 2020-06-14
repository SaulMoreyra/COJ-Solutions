import java.util.Scanner;
public class eje1177
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x;
        do{
            String [] entrada = lee.nextLine().split(" ");
            x = Integer.parseInt(entrada[0]);
            if(x == 0) break;
            String palabra = entrada[1];
            int t = palabra.length()/x;
            int ini = 0, fin = t;
            String acum = "";
            while(true){
                if(fin>palabra.length()) break;
                String tem = palabra.substring(ini,fin);
                acum += new StringBuilder(tem).reverse().toString();
                ini += t;
                fin += t;
            }
            System.out.println(acum);
        }while(true);
    }
}
