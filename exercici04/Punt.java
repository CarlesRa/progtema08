import java.lang.Math;
public class Punt{
    private double x;
    private double y;

    //constructors
    public Punt(){
        x=0;
        y=0;
    }

    public Punt(double x, double y){
        this.x=x;
        this.y=y;
    }

    //setters i getters
    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    //metodes

    /**
     * calcula la distancia en el pla
     * @param puntli pasem un objecte amb dues coordenades
     * @returnretorna un double amb la distancia del 0,0 al punt
     */
    public double calcularDistancia(){
        double distancia;
        distancia=Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distancia;
    }

    /**
     * visualitza les coordenades x-y del punt pasat
     * @param puntobjectr punt amb dues coordenades
     */
    public void visualitzarPunt(){
        System.out.printf("(%.1f, %.1f)\n",x,y);
    }

    public double calcularDistanciaEntreDosPunts(Punt punt1){
        double distancia;
        distancia=Math.sqrt((Math.pow(punt1.getX(), 2)-Math.pow(x, 2)) + (Math.pow(punt1.getY(), 2)-Math.pow(y, 2)));
        return distancia;
    }
}