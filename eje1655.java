import java.util.Scanner;
public class eje1655 {    
     public static void main(String[] args) {
          Scanner Lee;
          String s, t;
         
          Lee = new Scanner(System.in);
          while (Lee.hasNext()) {
               s = Lee.next();
               t= Lee.next();
               
               int i=0, j=0;
               while (i < s.length() && j < t.length()) {
                    if (s.charAt(i) == t.charAt(j))
                    i++;
                    j++;
                
               }
                if (i == s.length())
                    System.out.println("Yes");
                else
                    System.out.println("No");
          }
     }
}