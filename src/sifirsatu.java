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
public class sifirsatu
{
public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
        
    int kali,i,hasil;
    
        
    System.out.print("Masukkan sifir berapa :");
    kali=input.nextInt();
        
    System.out.println("Sifir Berapa ? -"+kali);
        
    for(i=1;i<=10;i++)
        
    {
            hasil=i*kali;
            System.out.println(kali+" x "+i+":"+hasil);
        
    }
    }
}
