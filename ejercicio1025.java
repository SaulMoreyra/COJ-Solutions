import java.util.Arrays;
import java.util.Scanner;
public class ejercicio1025 {
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        int grupos = leer.nextInt();
        int mitad = (grupos+1)/2;
        int[] para = new int[grupos];
            for (int i = 0; i < grupos; i++) {
                para[i]=leer.nextInt();
            }
              Arrays.sort(para);
              int suma = 0;
            for (int i = 0; i < mitad; i++) {
                suma += (para[i]+2)/2;
            }
            System.out.println(suma);
      
    }
}