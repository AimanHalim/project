import java.util.Scanner;
public class Suhu 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan suhu: ");
        float suhu=input.nextFloat();
        
        if(suhu>37 || suhu==98.6F)
        {
            System.out.println("Mungkin akan menghidap demam panas");
        }
        else
        {
          System.out.println("input salah");  
        }
    }
}
