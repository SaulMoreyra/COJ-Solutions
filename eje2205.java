import java.util.Scanner;
public class eje2205
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = lee.nextInt();
        for(int i =0;i<x;i++){
            int n1 = lee.nextInt();
            int n2 = lee.nextInt();
            int cont =0;
            for(int j=n1; j<=n2; j++){
                String bin = Integer.toBinaryString(j);
                for(int k=0;k<bin.length();k++){
                    if(bin.charAt(k)=='1'){
                        cont++;
                    }
                }
            }
            System.out.println(cont);
        }
    }
}