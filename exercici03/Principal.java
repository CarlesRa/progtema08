import java.util.Scanner;
public class Principal{
    static Scanner lec=new Scanner(System.in);
    static int n=0;
    static Alumne [] alumnos=new Alumne[100];//creem contenidor per a objectes
    public static int contador=0;//contador de posició array 
    public static void main(String[] args) {
        int num=0;
        int num2=0;
        String[] m1={"Nuevo alumno...","Baja alumno...","Consultas...","Alumnos aleatorios..."};
        String[] m2={"Por grupo...","Por edad...","Por nia...","Por apellidos...","Mostrar todos..."};
        Alumne aux= new Alumne();
        do{
            Lib.mosrtrarMenu("**GESTIÓN ALUMNOS**",m1, "Salir.....");//invoquem el metode de la llibreria.
            num=lec.nextInt();
            lec.nextLine();
            if(num>m1.length&&num!=0||num<0){//condició de entrada a menu
                System.out.print("\u001B[31mOpción incorrecta!!\u001B[0m \nPulse intro para continuar....");
                lec.nextLine();
            }
            else{
                switch(num){//switch per executar opcions del menú.
                    case 1:
                    aux.crearAlumne();
                    break;
                    case 2:
                    aux.removerAlumno();
                    break;
                    case 3:
                        do{
                            do{
                                Lib.mosrtrarMenu("   **CONSULTAS**",m2, "Volver al menú principal");
                                num2=lec.nextInt();
                                lec.nextLine();
                                if(num2>m2.length||num2<0){
                                    System.out.println("\u001B[31mOpción incorecta....\u001B[0m");
                                    System.out.print("Pulse intro para continuar: ");
                                    lec.nextLine();
                                }
                            }while(num2<0||num2>m2.length);
                            switch(num2){
                                case 1:
                                aux.mostrarPorGrupo();
                                System.out.print("Pulse intro para continuar: ");
                                lec.nextLine();
                                break;
                                case 2:
                                aux.mostrarPorEdad();
                                System.out.print("Pulse intro para continuar: ");
                                lec.nextLine();
                                break;
                                case 3:
                                aux.mostrarPorNia();
                                System.out.print("Pulse intro para continuar: ");
                                lec.nextLine();
                                break;
                                case 4:
                                aux.mostrarPorApellidos();
                                System.out.print("Pulse intro para continuar: ");
                                lec.nextLine();
                                break;
                                case 5:
                                aux.mostrarAlumnes();
                                System.out.print("Pulse intro para continuar: ");
                                lec.nextLine();
                                break;
                            }
                        }while(num2>0);
                    break;
                    case 4:
                    aux.crearAlumneAleatori();
                    break;
                }
            }
        }while(num!=0);
    }
}