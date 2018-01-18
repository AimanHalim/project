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
public class sifirtiga 
{
public static void main(String args[])
    {
    Scanner input = new Scanner(System.in);
    int nilai;
    System.out.print("Masukkan nombor: ");
    nilai=input.nextInt();
    while(nilai>0)
    {
        System.out.println(nilai);
        nilai--;
    }
    }
}
