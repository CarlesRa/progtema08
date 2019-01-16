package tk.carlesramos.progtema08.exercici05;
import tk.carlesramos.progtema08.exercici04.Punt;
public class Cercle {
    private Punt punt;
    private double radi;

    public Cercle(Punt punt, double radi) {
        this.punt = punt;
        this.radi = radi;
    }

    public Cercle(){
        punt = new Punt();
        radi = 0;
    }

    public Cercle(double x, double y,double radi){
        this.radi=radi;
        this.punt=new Punt(x,y);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "punt=" + punt +
                ", radi=" + radi +
                '}';
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

    public double calcularDistancia(Punt p2){
        double distancia=punt.calcularDistanciaEntreDosPunts(p2);
        return  distancia;
    }

    public double calcularArea(){
        double area = Principal05.PI*Math.pow(radi,2);
        return area;
    }

    public double calcularPerimetre(){
        double perimetre = 2*Principal05.PI*radi;
        return perimetre;
    }

    public void visualitzarCercle(){
        if(punt.getX()==0 && punt.getY()==0){
            System.out.println("Cercle de radi "+radi
            +" cm situat en l'origen de coordenades.");


        }
        else{
            System.out.print("Cercle de radi "+radi
            +" cm situat en el punt ");
            punt.visualitzarPunt();
        }
    }


}
