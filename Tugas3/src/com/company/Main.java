package com.company;

public class Main {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(12);
        System.out.println("\n == Persegi");
        System.out.println("Luas : " + persegi.Luas());
        System.out.println("Keliling : " + persegi.Keliling());

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("\n == Lingkaran");
        System.out.println("Luas : " + lingkaran.Luas());
        System.out.println("Keliling : " + lingkaran.Keliling());

        PersegiPanjang persegiPanjang = new PersegiPanjang(8,6);
        System.out.println("\n == Persegi Panjang");
        System.out.println("Luas : " + persegiPanjang.Luas());
        System.out.println("Keliling : " + persegiPanjang.Keliling());

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(8);
        segitiga.setTinggi(12);
        System.out.println("\n == Segitiga");
        System.out.println("Luas : " + segitiga.l());
        System.out.println("Keliling : " + segitiga.k());

        Kubus kubus = new Kubus(persegi.getSisi());
        System.out.println("\n == Kubus");
        System.out.println("Volume : " + kubus.volume());

        Balok balok = new Balok(persegiPanjang.getPanjang(),persegiPanjang.getLebar());
        balok.setTinggi(10);
        System.out.println("\n == Balok");
        System.out.println("Volume : " + balok.volume());

        Silinder silinder = new Silinder(lingkaran.getR());
        silinder.setTinggi(5);
        System.out.println("\n == Silinder");
        System.out.println("Volume : " + silinder.volume());
    }
}
