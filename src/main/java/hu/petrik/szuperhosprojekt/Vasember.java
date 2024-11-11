package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    private Random r=new Random();
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if(getSzuperero()>1000){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void kutyutKeszit() {
        setSzuperero(getSzuperero()+r.nextDouble(0,10));
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return false;
    }

    @Override
    public String toString() {
        return "Vasember: "+super.toString();
    }
}
