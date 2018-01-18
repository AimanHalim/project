
import java.util.Scanner;
public class tetsgaji 
{ public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama=input.next();
        
        System.out.print("Masukkan Bilangan Jam Kerja Sehari: ");
        int biljks=input.nextInt();
        
        System.out.print("Masukkan Bilangan Hari Bekerja: ");
        int bilhb=input.nextInt();
        
        System.out.print("Masukkan Bilangan Jam Kerja Lebih Masa: ");
        int biljklm=input.nextInt();
        
        if (biljks>=9)
        {
            System.out.println("Bilangan jam kerja sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam dengan betul. Trimas");
        }
        else if(biljks<9)
        {
            System.out.println("nice one! next!");
        }
        if (bilhb>=30)
        {
            System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan hari dengan betul");
        }
        else if(bilhb<30)
        {
            System.out.println("nice one! next!");
        }
        if (biljklm>=50)
        {
            System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan jam yang betul");
        }
        else if(biljklm<50)
        {
            System.out.println("nice one! next!");
        }
        
        double gaji=(biljks*20)+(biljklm*15);
        
        System.out.println("Nama:"+nama);
        System.out.println("Bilangan Jam Kerja Sehari:"+biljks);
        System.out.println("Bilangan Hari Bekerja:"+bilhb );
        System.out.println("Bilangan jam kerja lebih masa:"+biljklm);
        System.out.print("Jumlah Gaji: RM"+gaji);
        }
    }
