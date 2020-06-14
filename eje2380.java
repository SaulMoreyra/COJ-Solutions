import java.util.Scanner;
public class eje2380
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        int acum = 0;
        for(int i=0; i<x;i++){
            int y = lee.nextInt();
            String b = Integer.toBinaryString(y);
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='1'){
                    acum++;
                }
            }
        }
        System.out.println(acum);
    }
}
