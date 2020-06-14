import java.util.Scanner;
public class eje1615
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int [] conts;
        int menor, mayor;
        int caso = 0;
        do{
            menor = lee.nextInt();
            if(menor==0) break;
            mayor = lee.nextInt();
            if(menor>mayor){
                int aux = menor;
                int aux2 = mayor;
                mayor = aux;
                menor = aux2;
            }
            conts  = new int[10];
            caso++;
            for(int i=menor;i<=mayor;i++){
                String c = Integer.toString(i);
                for(int j=0;j<c.length();j++){
                    if(c.charAt(j)=='0') conts[0]++;
                    if(c.charAt(j)=='1') conts[1]++;
                    if(c.charAt(j)=='2') conts[2]++;
                    if(c.charAt(j)=='3') conts[3]++;
                    if(c.charAt(j)=='4') conts[4]++;
                    if(c.charAt(j)=='5') conts[5]++;
                    if(c.charAt(j)=='6') conts[6]++;    
                    if(c.charAt(j)=='7') conts[7]++;  
                    if(c.charAt(j)=='8') conts[8]++;     
                    if(c.charAt(j)=='9') conts[9]++;     
                }
            }
            System.out.print("Case "+caso+": ");
			System.out.print("0:"+conts[0]);
			for(int x = 1; x <= 9; x++){
				System.out.print(" "+x+":"+conts[x]);
			}
			System.out.println();
        }while(menor!=0);
    }
}