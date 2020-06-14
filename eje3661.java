import java.util.Scanner;
public class eje3661
{
    public static void main(String [] args)throws Exception{
        Scanner lee = new Scanner(System.in);
        char [] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
        while(true){
            String [] input = lee.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            if(x!=0){

                String word = new StringBuilder(input[1]).reverse().toString();
                String cod = "";
                for(int i=0; i<word.length(); i++){
                    int numero = busca(alpha,word.charAt(i));
                    if(numero+x >= alpha.length){
                        numero = (numero+x)-alpha.length;
                    }
                    else 
                        numero = numero + x;
                    cod += alpha[numero];
                }
                System.out.println(cod);
            }
            else break;
        }
    }

    public static int busca(char[] al, char ca)throws Exception{
        try{
            for(int i=0; i<al.length; i++){
                if(ca == al[i]){
                    return i;
                }
            }    
            
        }catch(Exception e) {System.out.println("Error busca  "+ e.toString());}
        return -1;
    }
}
