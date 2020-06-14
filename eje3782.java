import java.util.Scanner;
public class eje3782
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        for(int i=0; i<x; i++){
            int [] dados = new int[5];
            for(int j=0; j<dados.length; j++){
                dados[j] = lee.nextInt();
            }
            boolean b = true;
            for(int k=0; k<dados.length-1; k++){
                if(dados[k]+1 != dados[k+1]){
                    b = false;
                }
            }
            System.out.println(b? "Y" : "N");
        }
    }
}
