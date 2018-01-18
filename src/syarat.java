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
public class syarat
{
    public static void main(String args[])
{
    Scanner input= new Scanner(System.in);
    System.out.print("Masukkan masa: ");
    double masa=input.nextDouble();
    if (masa<10.30)//jika bla bla bla maka bla bla bla
    {
        System.out.println("anda awal");
    }
    else// jika pilihan berlainan dripada utama
    {
        System.out.println("anda lambat");
    }
}
               
}
