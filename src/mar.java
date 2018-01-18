import java.util.Scanner;
public class mar 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("jumlah subjek=" );
        int jum_sub=input.nextInt();
        
        double jum_mark=0;
        double per_btul;
                
        for (int i=0;i<jum_sub;i+=1)
        {
            System.out.print("masukkan markah="+i );
            double mark=input.nextDouble();
            
            jum_mark=jum_mark+mark;
            per_btul=jum_mark*100/ (jum_sub*100);
            {
                System.out.println("peratus betul="+per_btul);
                System.out.println("jumlah markah="+jum_mark);
            }
        }
    }
    
}
