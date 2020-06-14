import java.util.Scanner;
public class ejercicio1212
{
   public static void main(String [] args){
        Scanner lee=new Scanner(System.in);
        String linea;
      while(true){
          int cont=0;
           linea=lee.nextLine();
           String []lineas = linea.split("/");
          
          if(linea.equals("*")){break;}
           
          
          for(int j=0;j<lineas.length;j++) {
              double suma=0;
              for(int i=0;i<lineas[j].length();i++){
                
                  switch(lineas[j].charAt(i)){
                    case 'W':
                    suma+=1.0;
                    break;
                    case 'H':
                    suma+=1.0/2.0;
                    break;
                    case 'Q':
                    suma+=1.0/4.0;
                    break;
                    case 'E':
                    suma+=1.0/8.0;
                    break;
                    case 'S':
                    suma+=1.0/16.0;
                    break;
                    case 'T':
                    suma+=1.0/32.0;
                    break;
                    case 'X':
                    suma+=1.0/64.0;
                    break;
               
                      }
                      
                        }
              
               if(suma==1.0){
                  cont+=1;
              }
                        
         }
         
          System.out.println(cont);
        }
         
      }
 
    }