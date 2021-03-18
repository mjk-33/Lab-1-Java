package pl.kur.firstapp;

import java.util.Scanner;

public class Zadanie3
{
    public void Trojkat()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("TROJKAT");
        System.out.println(" ");
        System.out.println("Podaj bok a: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b: ");
        int b = scan.nextInt();
        System.out.println("Podaj bok c: ");
        int c = scan.nextInt();
        if (a<=0||b<=0||c<=0)
        {
            System.out.println("Cos popsules!");
        }
        else
        {
            if ((a*a)+(b*b) ==(c*c))
            {
                System.out.println("Trojkat jest prostokatny");
            }
            else
            {
                System.out.println("Trojkat nie jest prostokatny");
            }
        }
    }
}
