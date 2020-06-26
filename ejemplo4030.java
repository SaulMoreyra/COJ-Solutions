package COJ;

import java.util.Scanner;

/**
 * @author: Saúl Moreyra
 * @date: 06/03/2020
 * @time 10:32 p. m.
 * @proyect: ejemplos
 * @email drone_cam@outlook.es
 */
public class ejemplo4030 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int t = lee.nextInt();
        for (int i = 0; i < t; i++) {
            int n = lee.nextInt();
            int m = lee.nextInt();
            int r = n/(2*m);
            if(r == 0) System.out.println("Majpy is to short!");
            else System.out.println("Majpy do it "+r+" time!");
        }
    }
}
