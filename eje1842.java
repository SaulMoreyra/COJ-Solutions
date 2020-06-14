import java.util.Scanner;
public class eje1842
{
    public static void main (String [] arg)
    {
        Scanner lee = new Scanner(System.in);
        int n = lee.nextInt();
        int [] res = new int[n];
        for(int i=0; i<n; i++)
        {
            int X1 = lee.nextInt();
            int Y1 = lee.nextInt();
            int X2 = lee.nextInt();
            int Y2 = lee.nextInt();
            res[i] = (Math.abs(X2-X1))+(Math.abs(Y2-Y1));
        }
        for(int k=0; k<n; k++)
        {
            System.out.println(res[k]);
        }
    }
}