import java.util.Scanner;
import java.util.Arrays;
public class eje1318
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String [] cad1 = lee.nextLine().split(" ");
        String orden = lee.nextLine();
        int [] abc = new int[3];
        for(int i=0; i<3; i++){
            abc[i] = Integer.parseInt(cad1[i]);
        }
        int menor = 100;
        int mayor = 0; 
        int medio = 0;
        for(int i = 0; i < 3; i++)  if(menor > abc[i]) menor = abc[i];
        for(int i = 0; i < 3; i++)  if(mayor < abc[i]) mayor = abc[i];
        for(int i = 0; i < 3; i++)
            if ( abc[i] != mayor && abc[i] != menor )
                medio = abc[i];
                
        for ( int i = 0; i < 3; i++ ){
            if ( orden.charAt(i) == 'A' )
                System.out.print(menor);
            else if ( orden.charAt(i) == 'B' )
                System.out.print(medio);
            else if ( orden.charAt(i) == 'C' )
                System.out.print(mayor);
            if ( i != 2 )
                System.out.print(" ");
        }
    }
}
