import java.util.Scanner;
import java.util.Arrays;
public class eje1003
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int i = lee.nextInt();
        for(int x=0; x<i; x++){
            int columnas = lee.nextInt();
            int filas = lee.nextInt();
            int [] con = new int[columnas];
            for(int f=0; f<filas; f++ ){
                for(int c=0; c<columnas; c++){
                    con[c]+=lee.nextInt();
                }
            }
            int c=0, r=0;
            for(int j=0; j<con.length; j++){
                if(c<con[j]){
                    c=con[j];
                    r=j;
                }
            }
            System.out.println(r+1);
        }
    }
}
