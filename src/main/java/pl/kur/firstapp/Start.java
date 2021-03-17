package pl.kur.firstapp;
import java.util.Scanner;
public class Start
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        //              TEMPERATURA
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

        //              SEKWENCJA LICZB
        System.out.println("SEKWENCJA LICZB");
        int liczby[] = {1,2,3,4,5,6,7,8,9,10};
        if (liczby[0]==1 && liczby[1]==2 && liczby[2]==3)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

        //              TROJKAT
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

        //                  GWIAZDECZKI
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

        //          ZWROT Z TABLICY

        String jakasNazwa = scan.nextLine();
        int zwrot = jakasNazwa.length();
        String znaki = jakasNazwa.substring(1, zwrot/2);
        System.out.println(znaki);


    }
}
