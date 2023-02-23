package ticotinas;
import java.util.Scanner;
public class TicoTinas 
{

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int Tinas;
        int Segundos = 0;
        int ArrayTinas[];
        int Horas[]; 
        int Mins[];
        int Secs[];
        System.out.print("Ingrese la cantidad de tinas:");
        Tinas = Scan.nextInt();
        ArrayTinas = new int [Tinas];
        Horas = new int [Tinas];
        Mins = new int [Tinas];
        Secs = new int [Tinas];
        for (int i = 0; i < Tinas ; i++)
        {
            System.out.print("Ingrese cuantas gotas le caben a la tina "+(i+1)+":");
            ArrayTinas[i] = Scan.nextInt();
        }
        for (int i = 0; i < Tinas; i++)
        {
            for (int j = 0; j < ArrayTinas[i]; j++)
            {
                Segundos = Segundos + 1;
            }
            Secs [i] = Segundos;
            Mins [i] = Segundos/60;
            Horas [i] = Segundos/3600;
            Segundos = 0;
        }
        System.out.println("Tiempo:");
        System.out.println(" H    M    S");
        for (int i = 0 ; i < Tinas; i++)
        {
            System.out.println(Horas[i]+"    "+Mins[i]+"     "+Secs[i]);
        }
    }
    
}
