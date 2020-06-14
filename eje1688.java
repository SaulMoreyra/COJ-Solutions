import java.util.Scanner;
public class eje1688
{
    public static void main(String [] args){
        Scanner lee = new Scanner(System.in);
        int caso;
        do{
            caso = lee.nextInt();
            int i=0,j=0,k=0;
            if(caso==-1) break;
            if(caso==1){
                String ac = "";
                int l = lee.nextInt();
                for(i=1;i<=l;i++){
                    String as = "*";
                    String espacio="";
                    for(j=1;j<(i*2)-1;j++){
                        as+="*";
                    }
                    for(k=0;k<(l-i);k++){
                        espacio+=" ";
                    }
                    if(i!=l)
                    ac+= espacio+as+"\n";
                    else
                    ac+= espacio+as;
                }
                System.out.println(ac);
            }
            if(caso==2){
                String ac = "";
                int lp=lee.nextInt();
                int ap=lee.nextInt();
                for(i=1;i<=ap;i++){
                    String as = "*";
                    String espacio="";
                    for(j=1;j<lp;j++){
                        as+="*";
                    }
                    for(k=1;k<(lp-i)-1;k++){
                        espacio+=" ";
                    }
                    if(i!=ap)
                    ac+= espacio+as+"\n";
                    else
                    ac+= espacio+as;
                }
                System.out.println(ac);
                }
            
            if(caso==3){
                String ac = "";
                int lp=lee.nextInt();
                int ap=lee.nextInt();
                for(i=1;i<=ap;i++){
                    String as = "*";
                    for(j=1;j<lp;j++){
                        as+="*";
                    }
                    if(i!=ap)
                    ac+= as+"\n";
                    else
                    ac+= as;
                }
                
            System.out.println(ac);
            }
        }while(true);
    }
}
