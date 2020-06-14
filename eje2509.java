import java.util.Scanner;
public class eje2509
{
    public static void main(String [] aths){
        Scanner lee = new Scanner(System.in);
        while(lee.hasNextLine()){
            String r = lee.nextLine();
            r = r.replace("x","/");
            String [] t = r.split("/");
            int h = Integer.parseInt(t[0]);
            int v = Integer.parseInt(t[1]);
            
            double h1 = 1024/h;
            double v1 = 768/v;
            
            if(h1 == v1)
                System.out.println("Fill the screen.");
            else if(h1 > v1)
                System.out.println("Horizontally.");
            else
                System.out.println("Vertically.");
        }
    }
}
