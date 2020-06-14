import java.util.Scanner;
public class eje2746
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        String cad = lee.nextLine();
        int c = 0;
        for(int i=0;i<cad.length();i++){
            switch(cad.charAt(i)){
                case 'A':
                    c++;
                    break;
                case 'E':
                    c++;
                    break;
                case 'I':
                    c++;
                    break;
                case 'O':
                    c++;
                    break;
                case 'U':
                    c++;
                    break;
            }
        }
        System.out.println(c+" "+(cad.length()-c));
    }
}
