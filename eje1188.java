import java.util.Scanner;
public class eje1188
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String n1 = lee.nextInt()+"", n2 = lee.nextInt()+"";
        int a=0;
        for(int i=0; i<n1.length(); i++){
            for(int j=0; j<n2.length(); j++){
                a+=Integer.parseInt(n1.charAt(i)+"")*Integer.parseInt(""+n2.charAt(j));
            }
        }
        System.out.println(a);
    }
}
