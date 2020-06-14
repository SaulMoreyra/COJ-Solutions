import java.util.Scanner;
public class eje1051
{
    public static void main(String [] args)
    {
        Scanner enter=new Scanner(System.in);
        int secuencia=enter.nextInt();
        int suma=(secuencia/30)*20, res=secuencia%30;
        int sumatotal;
        int aux[]={0,0,1,2,2,3,4,4,5,6,6,7,8,8,9,10,10,11,12,12,13,14,14,15,16,16,17,18,18,19};
        sumatotal=suma+aux[res];
        System.out.println(sumatotal);
    }
}