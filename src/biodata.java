import java.util.Scanner;
public class biodata
{
 public static void main(String args[])   
 {
     Scanner input=new Scanner(System.in);
     System.out.print("Masukkan nama: ");
     String nama=input.next();
     
     System.out.print("Masukkan Jantina: ");
     String jantina=input.next();
     
     System.out.print("Masukkan Warna kegemaran: ");
     String warna=input.next();
     
     switch (warna)
     {
         case"Merah":
             System.out.println("kekuatan");
             break;
         case"Biru":
            System.out.println("ketenangan");
             break;
         case"Kuning":
            System.out.println("kegembiraan");
             break;
         case"Hijau":
            System.out.println("kehidupan");
             break;
        
     }
                 
     }
 }
