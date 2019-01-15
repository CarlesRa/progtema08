package tk.carlesramos.progtema08.exercici04;

public class Principal {
    private double x;
    private double y;
    public Principal(){
        Punt p1 = new Punt(12,14);
        Punt p2 = new Punt();
        Punt p3 = new Punt(15,2);
        System.out.println("\u001B[H\u001B[2JEl punt 1 està a "+p1.calcularDistancia()+" del punt 0-0, les coordenades son: ");
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
