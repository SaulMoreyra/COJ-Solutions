import java.util.Scanner;
public class eje1028
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        while(lee.hasNextLine()){
            String [] cad = lee.nextLine().split(" ");
            String p1 = cad[0];
            String p2 = cad[1];
            
            if(p2.contains(p1)){
                System.out.println("Yes");
            }    
            else {
                String s = "";
                int ec2 = 0;
                for(int i=0; i<p1.length(); i++){
                    for(int j = ec2; j<p2.length(); j++){
                        if(p1.charAt(i)==p2.charAt(j)){
                            s+= p2.charAt(j);
                            ec2 = j+1;
                            break;
                        }
                    }
                }
                if(s.equals(p1))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
