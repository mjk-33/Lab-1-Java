package pl.kur.firstapp;

import java.util.Scanner;

public class Zadanie4
{
    public void Gwiazdki()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jak duzy chcesz trojkat?");
        System.out.print("Wielkosc: ");
        int wielkosc = scan.nextInt();
        System.out.println("Gwiazdki");
        for (int i = 0; i<wielkosc;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
