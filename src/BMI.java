
import java.util.Scanner;
class BMI
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
System.out.print("Nama : ");
String nama= input.next();

System.out.print("Tinggi : ");
double tinggi= input.nextDouble();

System.out.print("berat: ");
double berat= input.nextDouble();

double bmi=berat/(tinggi*tinggi);

if(bmi<=18.5)
{
    System.out.println("Kurang berat badan");
}
else if(bmi<=25 && bmi>18.5)
{
    System.out.println("Normal");
}
else if(bmi<=30 && bmi>25)
{
    System.out.println("Berat badan berlebihan");
}
else
{
    System.out.println("gemuk");
}

}
}