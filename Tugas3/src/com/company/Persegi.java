package com.company;


public class Persegi extends BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    @Override
    public double Luas() {
        return sisi*sisi;
    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }

    public Persegi(double sisi){
        this.sisi = sisi;
    }
}
