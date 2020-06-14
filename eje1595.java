import java.util.Scanner;
public class eje1595
{
    public static void main(String [] arg){
        Scanner lee = new Scanner(System.in);
        while(true){
            String num1 = lee.nextLine();
            if(num1.equals("0")) break;
            String num = num1;
            int cont=0;
            while(true){
                int x=0;
                for(int i=0; i<num.length(); i++){
                    x += Integer.parseInt(""+num.charAt(i));
                }
                
                cont+=1;
                if((x+"").length()==1){
                    if(x==9){
                        System.out.println(num1+" is a multiple of 9 and has 9-degree "+cont+".");
                        break;
                    }
                    else{
                        System.out.println(num1+" is not a multiple of 9.");
                        break;
                    }
                }
                else{
                    num = ""+x;
                }
            }
        }   
    }
}
