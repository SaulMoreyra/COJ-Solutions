import java.util.Scanner;
public class eje1101
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int c = lee.nextInt();
        for(int i=0;i<c;i++){
            int x = lee.nextInt();
            int y = lee.nextInt();
            String acum = "";
            for(int j=x;j<=y;j++){
                String b = Integer.toBinaryString(j);
                StringBuffer sb = new StringBuffer(b);
                sb = sb.reverse();
                if(b.equalsIgnoreCase(sb.toString())){
                    acum+=j+" ";
                }
            }
            System.out.println(acum);
        }
    }
}
