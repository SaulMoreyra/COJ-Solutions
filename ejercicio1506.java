import java.util.Scanner;

public class ejercicio1506
{
    public static void main (String [] args){
    Scanner lee=new Scanner (System.in);
    int preguntas=lee.nextInt();
    String respuestas=lee.next();
    int casos=lee.nextInt();
    for(int i=0;i<casos;i++){
     double calificacion=0.00;
      String respuestalum=lee.next();
      for(int j=0;j<preguntas;j++){
            if(respuestalum.charAt(j)==respuestas.charAt(j)){
               calificacion+=1.00;
               
            }
            else{
              if(respuestalum.charAt(j) != '#'){
                   calificacion -= 0.25;
                 }
                    }
       }
      System.out.printf("%.2f\n",calificacion);
    }
  }
}