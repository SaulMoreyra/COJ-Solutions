import java.util.Scanner; // Se importa la libreria para poder utilizarlo
public class eje1167
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in); // Creas una variable de tipo Scanner que se llama lee
       
        //Creas una variable de tipo String que se llama entradaTexto
        //No necesitas usar el parse pues nextLine te regresa un String
        String entradaTexto = lee.nextLine();
        
        //Creas una variable de tipo int que se llama numeroEntero
        //Usas el objeto lee para leer la linea y con Integer.parseInt lo vuelves entero
        int numeroEntero = Integer.parseInt(lee.nextLine()); 
        
        
        //Creas una variable de tipo double que se llama numeroDouble
        //Usas el objeto lee para leer la linea y con Double.parseDouble lo vuelves double
        double numeroDoble = Double.parseDouble(lee.nextLine());
        
        
        /**
           Nunca combines lee.next() y luego lee.nextLine() o lee.nextInt() se buguea el Scanner
           **/
    }
}
