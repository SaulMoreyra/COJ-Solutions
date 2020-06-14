import java.util.Scanner;
import java.util.Arrays;
public class eje1495

{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int x = Integer.parseInt(lee.nextLine());
        int [] arr = new int[x];
        for(int i=0; i<x;i++){
            int y = Integer.parseInt(lee.nextLine());
            arr[i]=y;
        }
        Arrays.sort(arr);
        for(int j=0; j<x;j++){
            System.out.println(arr[j]);
        }
    }
}
