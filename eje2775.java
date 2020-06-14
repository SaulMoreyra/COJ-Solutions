import java.util.Scanner;
public class eje2775
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        for(int i=0;i<x;i++){
            String c = lee.nextLine();
            switch(c.charAt(0)){
                case 'a':
                    System.out.println(c+"cow");
                    break;
                case 'e':
                    System.out.println(c+"cow");
                    break;
                case 'i':
                    System.out.println(c+"cow");
                    break;
                case 'o':
                    System.out.println(c+"cow");
                    break;
                case 'u':
                    System.out.println(c+"cow");
                    break;
                default:
                    System.out.println(c.substring(1)+c.charAt(0) +"ow");
            }
        }
    }
}
