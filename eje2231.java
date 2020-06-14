import java.util.Scanner;
public class eje2231
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        int a=0, b=0;
        for(int i=0;i<x;i++){
            String linea = lee.nextLine();
            switch(linea){
                case "rock scissors": case "scissors paper": case "paper rock":
                    a++;
                    break;
                case "scissors rock": case "paper scissors": case "rock paper":
                    b++;
                    break;
                default: break;
            }
        }
        if(a>b) System.out.println("A win");
        if(a<b) System.out.println("B win");
        if(a==b) System.out.println("tied");
    }
}
