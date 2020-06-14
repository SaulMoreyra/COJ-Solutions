import java.util.Scanner;
public class eje2634
{
    public static void main(String [] args){
        int [] m = new int[12];
        Scanner lee = new Scanner(System.in);
        int c = Integer.parseInt(lee.nextLine());
        for(int i=0;i<c;i++){
            String [] l = lee.nextLine().split("/");
            switch(Integer.parseInt(l[1])){
                case 1:
                    m[0]++;
                    break;
                case 2:
                    m[1]++;
                    break;
                case 3:
                    m[2]++;
                    break;
                case 4:
                    m[3]++;
                    break;
                case 5:
                    m[4]++;
                    break;
                case 6:
                    m[5]++;
                    break;
                case 7:
                    m[6]++;
                    break;
                case 8:
                    m[7]++;
                    break;
                case 9:
                    m[8]++;
                    break;
                case 10:
                    m[9]++;
                    break;
                case 11:
                    m[10]++;
                    break;
                case 12:
                    m[11]++;
                    break;
            }
            
        }
        for(int j=0;j<m.length;j++){
            System.out.println((j+1)+" "+m[j]);
        }
    }
}
