package tk.carlesramos.progtema08.exercici05;
import tk.carlesramos.progtema08.exercici04.Punt;

public class Principal05 {
    static  final double PI=Math.PI;
    public Principal05(){
        Punt p1 = new Punt(5,7);
        Punt p2 = new Punt(8,5);
        Punt p3 = new Punt(5,12);
        Punt p4 = new Punt(0,0);
        Cercle c1 = new Cercle(p1,6);
        Cercle c2 = new Cercle(p3,12);
        Cercle c3 = new Cercle(p4,15);
        System.out.println("visualitzem el cercle 1");
        c1.visualitzarCercle();
        System.out.println("\nVisualitzem el cercle 2");
        c2.visualitzarCercle();
        System.out.println("\nVisualitzem el cercle 3 ");
        c3.visualitzarCercle();

        System.out.print("\nLa distancia entre el centre del cercle 1 cituat en: ");
        p1.visualitzarPunt();
        System.out.print(" y el punt: ");
        p2.visualitzarPunt();
        System.out.println(" \nes igual a: "+c1.calcularDistancia(p2));
        System.out.println("El area del cercle 1 es: "+c1.calcularArea());
        System.out.println("El perimetre del cercle 1 es: "+c1.calcularPerimetre());

        System.out.print("\n\nLa distancia entre el centre del cercle 2 cituat en: ");
        p3.visualitzarPunt();
        System.out.print(" y el punt: ");
        p3.visualitzarPunt();
        System.out.println(" \nes igual a: "+c2.calcularDistancia(p3));
        System.out.println("El area del cercle 2 es: "+c2.calcularArea());
        System.out.println("El perimetre del cercle 2 es: "+c2.calcularPerimetre());

        System.out.print("\n\nLa distancia entre el centre del cercle 3 cituat en: ");
        p4.visualitzarPunt();
        System.out.print(" y el punt: ");
        p2.visualitzarPunt();
        System.out.println(" \nes igual a: "+c3.calcularDistancia(p2));
        System.out.println("El area del cercle 2 es: "+c3.calcularArea());
        System.out.println("El perimetre del cercle 2 es: "+c3.calcularPerimetre());
    }

}
