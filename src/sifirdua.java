/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
import java.util.Scanner;
public class sifirdua {

    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    int i,num,hasil;
    hasil=0;
    
    for(i=1;i<=5;i++)
    {
        System.out.print("Masukkan Nombor anda :");
        num=input.nextInt();
        System.out.println("NOMBOR : "+i+": "+num);
        
        hasil=hasil+num;
    }
    System.out.println("hasil tambah:"+hasil);
    }
}
