package COJ;

import java.util.Scanner;

/**
 * @author: Saúl Moreyra
 * @date: 06/03/2020
 * @time 10:55 p. m.
 * @proyect: ejemplos
 * @email drone_cam@outlook.es
 */
public class ejemplo4092 {
    public static void main(String[] args) {
        int c = (new Scanner(System.in)).nextInt();
        if(c < 2) System.out.println("WRONG ANSWER");
        else if (c < 3) System.out.println("RUNTIME ERROR");
        else System.out.println("ACCEPTED");
    }
}
