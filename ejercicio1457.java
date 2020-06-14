import java.util.Scanner;
public class ejercicio1457
{
    public static void main(String [] args){
        Scanner lee=new Scanner(System.in);
        long partidos,juegos;
        partidos=lee.nextLong();
        juegos=lee.nextLong();
        if(partidos%2==0){
         
            System.out.println(((partidos/2)*juegos)*(partidos-1));
        
        }
        else {
            System.out.println((((partidos/2)*juegos)+juegos)*(partidos-1));
        }
        
    }
    
}