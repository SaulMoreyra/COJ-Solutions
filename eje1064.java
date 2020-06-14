import java.util.Scanner;
public class eje1064
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int h1, m1, h2, m2 , t1, t2,d;
        do{
            h1 = lee.nextInt();
            m1 = lee.nextInt();
            h2 = lee.nextInt();
            m2 = lee.nextInt();
            if(h1==0 && m1==0 && h2==0 && m2==0)
            break;
            t1=(h1*60)+m1;
            t2=(h2*60)+m2;
            if(t2<t1)
                d=(t2+(24*60))-t1;
            else
                d=t2-t1;
            System.out.println(d);
        }while(true);
    }
}
