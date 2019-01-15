package tk.carlesramos.progtema08.exercicistema08;

public class Cercle {
    private Punt punt;
    private double radi;

    public Cercle(Punt punt, double radi) {
        this.punt = punt;
        this.radi = radi;
    }

    public Punt getPunt() {
        return punt;
    }

    public void setPunt(Punt punt) {
        this.punt = punt;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public Cercle(){
        punt = new Punt();
        radi = 0;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "punt=" + punt +
                ", radi=" + radi +
                '}';
    }
}
