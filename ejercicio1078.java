import java.util.Scanner;
public class ejercicio1078
{
    public static void main(String []args)
    {
         int casos,ninos,suma;
         
         Scanner lee=new Scanner (System.in);
        casos=lee.nextInt();
        
          for(int i=0;i<casos;i++){
                suma=0;
                ninos=lee.nextInt();
                
              
                for(int j=0;j<ninos;j++){
                    suma=(suma%ninos+(int)(lee.nextLong()%ninos))%ninos;
                    
                    
                }
                
                 if (suma%ninos==0){
                System.out.println("YES");
                    } else {
                    
                System.out.println("NO");
                    }
                    
                
              }
    }

}