import java.util.Scanner;
public class ejercicio1445{
    public static void main(String[]args){
        Scanner lee = new Scanner(System.in);
        int a, b, c;

        while(true){
            a = lee.nextInt();
            b = lee.nextInt(); 
            c = lee.nextInt();
            if(a == 0 && b == 0 && c == 0) {
            break;}
            
            else{
                //para determinar si es una progresion aritmetica o geometrica xd :v
                
                if((b-a) == (c-b)){
                    System.out.println("AP "+(c+(c-b)));
                }
                else{
                    System.out.println("GP "+(c*(c/b)));
                }
            }
        }
    }
}