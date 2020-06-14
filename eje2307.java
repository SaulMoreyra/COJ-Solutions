import java.util.Scanner;
public class eje2307
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int y=0;y<x;y++){
            String romano = lee.nextLine();
            char Rom[]= {'I','V','X','L','C','D','M'}; 
            int valor[] = {1,5,10,50,100,500,1000};
            int ant = 0;
            int suma = 0;
            char letra = ' ';
            for(int i = 0; i < romano.length(); i++){
                    letra = romano.charAt(i);
                    for(int j = 0; j < Rom.length; j++){
                        if(letra == Rom[j]){                
                                    suma = suma + valor [j]; 
                                if( ant < valor[j]){ 
                                        suma = suma - ant*2 ; 
                                        ant = valor[j]; 
                                }else {
                                    ant = valor[j];
                                }
                        }              
                    }
            }
            System.out.print((suma%3==0)? "YES "+suma: "NO "+suma);  
        }
   }
}
