import java.util.Scanner;
public class eje2444
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String cad = lee.nextLine();
        String [] aux = cad.split(" ");
        int acu=0;
        for(int i = 0; i<aux.length;i++){
            String b = Integer.toBinaryString(Integer.parseInt(aux[i]));
            int x=0;
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='1'){
                        x++;
                }
            }
            if(x%2==0){
               acu++; 
            }
        }
        System.out.println(acu);
    }
}