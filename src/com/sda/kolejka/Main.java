package com.sda.kolejka;

public class Main {
    public static void main(String[] args) {

        //KolejkaLista kolejka = new KolejkaLista();
        KolejkaObj kolejka = new KolejkaObj();

        kolejka.add(8);
        kolejka.add(10);
        kolejka.add(12);

        System.out.println(kolejka);

        int poczatek = kolejka.pop();
        System.out.println(poczatek);

        System.out.println(kolejka);

        int pierwszyWKolejce = kolejka.push();
        System.out.println("Pierwszy zdjęty z kolejki : "+pierwszyWKolejce);

        System.out.println(kolejka);

        kolejka.add(14);
        kolejka.add(16);
        System.out.println(kolejka);
    }

}
