import java.io.*;
public class eje2844
{
  public static void main(String [] args)throws IOException{
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String palabra;
      String linea;
      int casos=0,rep=0;
      palabra=bf.readLine();
      while((linea = bf.readLine())!=null){
            casos++;
              String [] aux  =linea.split(" ");
                for(int i=0;i<aux.length;i++){
                        if(aux[i].equalsIgnoreCase(palabra)){
                            rep++;
                        }
                }
            
        if(casos==100){break;}
    }
     System.out.println(rep);
    }
      
}