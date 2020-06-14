import java.util.Scanner;
public class eje1679
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int num = Integer.parseInt(lee.nextLine());
        String [] datos;
        String name = "";
        double f= 0;
        for(int i=0; i<num; i++){
            String en = lee.nextLine();
            int c = 0;
            for(int j=0; j<en.length(); j++){
                if(Character.isDigit(en.charAt(j))){ c = j; break; }
            }
            String x = en.substring(0,c-1);
            datos = en.substring(c).split(" ");
            int PA = Integer.parseInt(datos[0]);
            int PJ = Integer.parseInt(datos[1]);
            int G = Integer.parseInt(datos[2]);
            int A = Integer.parseInt(datos[3]);
            int TA = Integer.parseInt(datos[4]);
            int TR = Integer.parseInt(datos[5]);
            double fa = Math.log10(PA) + PJ + 2*G + A - (TA + 2 * TR);
            if(fa>f) {f = fa; name = x; }
        }
        System.out.println(name);
    }
}

