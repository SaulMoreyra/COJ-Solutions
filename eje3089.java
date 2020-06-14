import java.util.Scanner;
public class eje3089
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String [] enano = {"dormilon","feliz","mudito","timido","grunnon","mocoso","sabio"};
        int [] pacum = new int [7];
        int [] puntos = {1,5,10,15,20,25,30};
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                pacum[i] += lee.nextInt() * puntos[j];
            }
        }
        int g = 0, p=0;
        
        
        boolean flag = false;
        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(pacum[i] == pacum[j]  && i!=j){
                    flag = true;
                }
            }
        }
        
        
        for(int k=0; k<7; k++){
            if(pacum[k] > g){
                g = pacum[k];
                p = k;
            }
        }
        System.out.println(flag? "Blancanieve y los siete enanitos":enano[p]);
    }
}