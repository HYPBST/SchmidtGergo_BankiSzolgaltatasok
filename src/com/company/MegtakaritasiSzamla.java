package com.company;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;
    private static double alapKamat;

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    @Override
    boolean kivesz(int osszeg) {
        return false;
    }
}
