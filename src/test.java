import java.util.Scanner;
public class test 
{
 public static void main(String args[])
 {
     Scanner input= new Scanner(System.in);
     int i,jum;
     System.out.print("masukkan sifir: ");
     int kali=input.nextInt();
     for (i=0;i<=12;i++)
     {
        jum=kali*i;
        System.out.println(i+"x"+kali+"="+jum);
        
         
     }
     
 }
}
