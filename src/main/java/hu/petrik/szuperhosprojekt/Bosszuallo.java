package hu.petrik.szuperhosprojekt;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo masik = (Bosszuallo) szuperhos;
            return masik.isVanEGyengesege() && this.szuperero > masik.getSzuperero();
        }
        System.out.println(szuperhos instanceof Batman);
        if (szuperhos instanceof Batman) {
            Batman batman = (Batman) szuperhos;
            return this.szuperero >= batman.mekkoraAzEreje()*2;
        }
        return false;
    }


    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        int ero= (int) Math.round(szuperero*100)/100;
        String s = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return String.format("Szupererő: %d; %s",ero,s);
    }
}
