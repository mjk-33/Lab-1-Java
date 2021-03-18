package pl.kur.firstapp;
import java.util.Scanner;
public class Zadanie1
{
    public void Temp()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("TEMPERATURA");
        System.out.println(" ");
        System.out.println("Podaj pierwsza temperature: ");
        int pierwsza = scan.nextInt();
        System.out.println("Podaj druga temperature: ");
        int druga = scan.nextInt();
        System.out.println(pierwsza+" "+druga);

        if (pierwsza < 100||druga<100)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
