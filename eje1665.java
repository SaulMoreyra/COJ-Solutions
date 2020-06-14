import java.util.Scanner;
public class eje1665
{
    public static void main(String [] arg){
        Scanner lee  = new Scanner(System.in);
        String a = "";
        while(lee.hasNextLine()){
            String cad = lee.nextLine();
            
            for(int i=0;i<cad.length();i++){
                switch(cad.charAt(i)){
                    case '\':
                        a+=']';
                        break;
                    case ']':
                        a+='[';
                        break;
                    case '[':
                        a+='P';
                        break;
                    case 'P':
                        a+='O';
                        break;
                    case 'O':
                        a+='I';
                        break;
                    case 'I':
                        a+='U';
                        break;
                    case 'U':
                        a+='Y';
                        break;
                    case 'Y':
                        a+='T';
                        break;
                    case 'T':
                        a+='R';
                        break;
                    case 'R':
                        a+='E';
                        break;
                    case 'E':
                        a+='W';
                        break;
                    case 'W':
                        a+='Q';
                        break;
                    case ''':
                        a+=';';
                        break;
                    case ';':
                        a+='L';
                        break;
                    case 'L':
                        a+='K';
                        break;
                    case 'K:
                        a+='J';
                        break;
                    case 'J':
                        a+='H';
                        break; 
                    case 'H':
                        a+='G';
                        break;
                    case 'G':
                        a+='F';
                        break;
                    case 'F':
                        a+='D';
                        break;
                    case 'D':
                        a+='S';
                        break;
                    case 'D':
                        a+='A';
                        break;
                    case '/':
                        a+='.';
                        break;
                    case '.':
                        a+=',';
                        break;
                    case ',':
                        a+='M';
                        break;
                    case 'M':
                        a+='N';
                        break;
                    case 'N':
                        a+='B';
                        break;
                    case 'B':
                        a+="V";
                        break;
                    case 'V':
                        a+='C';
                        break;
                    case 'C':
                        a+='X';
                        break;
                    case 'X':
                        a+='Z';
                        break;
                    case '=':
                        a+='-;
                        break;
                    case '-':
                        a+='0';
                        break;
                    case '0':
                        a+='9';
                        break;
                    case '9':
                        a+='8';
                        break;
                    case '8':
                        a+='7';
                        break;
                    case '7':
                        a+='6';
                        break;
                    case '6':
                        a+='5';
                        break;
                    case '5':
                        a+='4';
                        break;
                    case '4':
                        a+='3';
                        break;
                    case '3':
                        a+='2';
                        break;
                    case '2':
                        a+='1';
                        break;
                    case '1':
                        a+='`';
                        break;
                }
            
            }
           System.out.println(a); 
        }
    }
}
