import java.util.Scanner;
public class eje2948
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int casos = Integer.parseInt(lee.nextLine());
        for(int j=0; j<casos; j++){
            String x = lee.nextLine();
            while(x.length()>1){
                int temp = 0;
                for(int i = 0; i<x.length(); i++){
                    temp += Integer.parseInt(x.charAt(i)+"");
                }
                x = temp + "";
            }
            System.out.println(x);
        }
    }
}
