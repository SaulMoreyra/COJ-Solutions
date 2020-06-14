import java.util.Scanner;
public class eje3698{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int t = lee.nextInt();
        String p = lee.next();
        int cM=0, cm=0;
        for(int i=0; i<t; i++){
            if(p.charAt(i)>='A' && p.charAt(i)<='Z')
                cM++;
            else if(p.charAt(i)>='a' && p.charAt(i)<='z')
                cm++;
        }
        System.out.println(cM+" "+cm);
    } 
}
