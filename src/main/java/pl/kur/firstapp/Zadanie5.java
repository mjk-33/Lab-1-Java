package pl.kur.firstapp;

import java.util.Scanner;

public class Zadanie5
{
    public void Zwrot()
    {
        System.out.println("Podaj wyraz do podzielenia: ");
        Scanner scan = new Scanner(System.in);
        String wyraz = scan.nextLine();
        int ilosc = wyraz.length();
        String polowa = wyraz.substring(0,(ilosc/2));
        System.out.println(polowa);

    }
}
