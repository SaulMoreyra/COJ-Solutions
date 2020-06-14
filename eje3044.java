import java.util.Scanner;
public class eje3044
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int [] a = new int[2];
        for(int j=0;j<2;j++){
            for(int i=0;i<4;i++){
                a[j]+=lee.nextInt();
            }
        }
        if(a[0]>a[1])
            System.out.println("Gunnar");
        if(a[0]<a[1])
            System.out.println("Emma");
        if(a[0]==a[1])
            System.out.println("Tie");
    }
}
