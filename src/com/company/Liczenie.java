package com.company;

public class Liczenie {
    double km;
    double paliwo;
    double pln;

    double cena;
    double spalanie;

    //pobrane dane
   public double getKm(){
        return km;
    }
    double getPaliwo(){
        return paliwo;
    }
    double getPln(){
        return pln;
    }

    //Obliczenia
    public double liczCena(){
        cena = paliwo * pln;
        return cena;
    }
    double liczSpalanie(){
        km = km / 100;
        spalanie = paliwo / km;
        return spalanie;
    }
}
