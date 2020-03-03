package com.company;

public class PersegiPanjang extends BangunDatar {
    private double p;
    private double l;

    public double getPanjang() {
        return p;
    }

    public double getLebar() {
        return l;
    }

    @Override
    public double Luas() {
        return p*l;
    }

    @Override
    public double Keliling() {
        return 2*(p*l);
    }

    public PersegiPanjang(double p, double l)
    {
        this.p = p;
        this.l = l;
    }

}
