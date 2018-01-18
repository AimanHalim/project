import java.util.Scanner;
class Gaji 
{   
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama=input.next();
       int bil_jam_sehari;
        do{           
            System.out.print("Masukkan Bilangan Jam Kerja Sehari: ");
           bil_jam_sehari=input.nextInt();
           if (bil_jam_sehari>9)
           {
               System.out.println("Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul. ");
           }
       bil_jam_sehari++;
        }
        while (bil_jam_sehari>9);
        
        
        int bil_hari;
        do{           
            System.out.print("Masukkan Bilangan Hari Bekerja: ");
           bil_hari=input.nextInt();
           if (bil_hari>30)
           {
               System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari,sila masukkan bilangan hari yang betul. ");
           }
       bil_hari++;
        }
        while (bil_hari>30);
        
        int bil_jam_ot;
        do{           
            System.out.print("Masukkan Bilangan jam kerja lebih masa: ");
           bil_jam_ot=input.nextInt();
           if (bil_jam_ot>50)
           {
               System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul. ");
           }
       bil_jam_ot++;
        }
        while (bil_jam_ot>50);
        
        double gaji=(bil_jam_sehari*bil_hari*20)+(bil_jam_ot*15);
        
        System.out.println("Rumusan gaji bulanan "+nama+":");
        System.out.println("Jumlah Jam bekerja:"+bil_jam_sehari+"jam");
        System.out.println("Jumlah Hari Bekerja:"+bil_hari+"hari" );
        System.out.println("Jumlah jam lebih masa:"+bil_jam_ot+"jam");
        System.out.print("JUMLAH GAJI: RM"+gaji);
        }
    }
    