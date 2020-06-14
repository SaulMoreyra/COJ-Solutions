import java.util.Scanner;
public class eje2300
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        
        String p = lee.nextLine();
        int cont = 0;
        for(int i=0;i<p.length();i++){
            switch(p.charAt(i)){
                case 'A': case 'B': case 'C':
                    cont +=3;
                    break;
                case 'D': case 'E': case 'F':
                    cont +=4;
                    break;
                case 'G': case 'H': case 'I':
                    cont +=5;
                    break;
                case 'J': case 'K': case 'L':
                    cont +=6;
                    break;
                case 'M': case 'N': case 'O':
                    cont +=7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    cont += 8;
                    break;
                case 'T': case 'U': case 'V':
                    cont +=9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    cont +=10;
                    break;
            }
        }
        System.out.println(cont);
    }
}
