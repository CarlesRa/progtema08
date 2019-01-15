package tk.carlesramos.progtema08.exercicistema08;

public class Punt {
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

    public void main() {
        Punt p1 = new Punt(12,14);
        Punt p2 = new Punt();
        Punt p3 = new Punt(15,2);
        System.out.println("\u001B[H\u001B[2JEl punt 1 està a "+p1.calcularDistancia() +" del punt 0-0, les coordenades son: ");
        p1.visualitzarPunt();
        System.out.println("visualitzem el punt 2: ");
        p2.visualitzarPunt();
        System.out.println("Camviem els valors i els mostrem: ");
        p2.setX(45.36);
        p2.setY(25.36);
        //imprimir
        p2.visualitzarPunt();
        System.out.println("Esta a "+p2.calcularDistancia()+" del punt 0-0.");
        System.out.println("Visualitzem el 3er punt creat: ");
        p3.visualitzarPunt();
        System.out.println("Esta a "+p3.calcularDistancia()+" respecte al punt 0-0.");
        System.out.println("Calculem la distancia entre el p3 i el punt 2");
        System.out.println(p3.calcularDistanciaEntreDosPunts(p2));
    }
}
