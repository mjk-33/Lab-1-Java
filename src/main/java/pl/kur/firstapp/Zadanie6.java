package pl.kur.firstapp;
import java.util.Arrays;
public class Zadanie6
{
    public void Zamiana()
    {
        int ciag[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(ciag));
        for(int i = 0; i < ciag.length / 2; i++)
        {
            int temp = ciag[i];
            ciag[i] = ciag[ciag.length - i - 1];
            ciag[ciag.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ciag));
    }
}
