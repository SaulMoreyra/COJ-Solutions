import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class eje2397
{
    public static void main(String [] args){
    
        final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            String l = lee.nextLine();
            String [] aux = l.split(" ");
            String [] f1 = aux[0].split("-");
            String [] f2 = aux[1].split("-");
            
            int año = Integer.parseInt(f1[0]);
            int dia = Integer.parseInt(f2[2]);
            
            Calendar calendar = new GregorianCalendar(año, Integer.parseInt(f1[1])-1, Integer.parseInt(f1[2])); 
            java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
            
            
            Calendar calendar1 = new GregorianCalendar(Integer.parseInt(f2[0]), Integer.parseInt(f2[1])-1, Integer.parseInt(f2[2])); 
            java.sql.Date fecha1 = new java.sql.Date(calendar1.getTimeInMillis());
            
            
            if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
                long diferencia =  (fecha1.getTime() - fecha.getTime() )/MILLSECS_PER_DAY; 
                System.out.println(diferencia+1);
            }
            else{
                long diferencia =  (fecha1.getTime() - fecha.getTime() )/MILLSECS_PER_DAY; 
                System.out.println(diferencia);
            }
        }   
    }
}