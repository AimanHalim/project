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
public class sifirempat 
{
public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    int i,num,hasil;
    hasil=0;
    i=1;
    do
    {
        System.out.print("Masukkan Nombor anda");
        num=input.nextInt();
        System.out.println("nombor "+i+": "+num);
        
        hasil=hasil+num;
        i++;
    }
    while(i<=5);
    System.out.println("jumlah :"+hasil);
    }
}

