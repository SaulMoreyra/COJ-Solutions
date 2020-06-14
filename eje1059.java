import java.util.Scanner;
public class eje1059
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int nd; 
        do{
            nd = lee.nextInt(); 
            
            if(nd!=0){
                String b = Integer.toBinaryString(nd);
                int x=0;
                for(int i = 0; i<b.length();i++){
                    if(b.charAt(i)=='1'){
                        x++;
                    }
                }
                System.out.println("The parity of "+b+" is "+x+" (mod 2).");
            }
        }while(nd!=0);
    }
}
