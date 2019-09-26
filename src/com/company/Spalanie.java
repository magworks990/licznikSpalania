package com.company;

import java.util.Scanner;

public class Spalanie {
    public static void main(String[] args)
    {
        Liczenie liczenie = new Liczenie();

        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj przejechane kilometry");
//        liczenie.km = skaner.nextDouble();
        System.out.println("Podaj zatankowane paliwo");
        liczenie.paliwo = skaner.nextDouble();
        System.out.println("Podaj cenę litra paliwa");
        liczenie.pln = skaner.nextDouble();


        liczenie.liczSpalanie();
        liczenie.liczCena();

        System.out.println("Spalanie wynosi " + liczenie.spalanie + " litrów na 100 kilometrów.");
        System.out.println("Koszt tankowania wynosi " + liczenie.cena + " złotych.");
    }

}
