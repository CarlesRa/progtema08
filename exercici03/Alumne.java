import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
public class Alumne {
    private int nia;
    private String nom;
    private String cognom;
    private String dataNaiximent; 
    private String grup;
    private int telefon;
    //constructors
    public Alumne(){
        nia=0;
        nom="";
        cognom="";
        dataNaiximent="";
        grup="";
        telefon=0;
    }
    public Alumne(int nia, String nom, String cognom, String dataNaiximent, String grup, int telefon){
        this.nia=nia;
        this.nom=nom;
        this.cognom=cognom;
        this.dataNaiximent=dataNaiximent;
        this.grup=grup;
        this.telefon=telefon;
    }
    //setters i getters.
    public void setNia(int nia){
        this.nia=nia;
    }
    public int getNia(){
        return nia;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return nom;
    }
    public void setCognom(String cognom){
        this.cognom=cognom;
    }
    public String getCognom(){
        return cognom;
    }
    public void setDataNaiximent(String dataNaiximent){
        this.dataNaiximent=dataNaiximent;
    }
    public String getDataNaiximent(){
        return dataNaiximent;
    }
    public void setGrup(String grup){
        this.grup=grup;
    }
    public String getGrup(){
        return grup;
    }
    public void setTelefon(int telefon){
        this.telefon=telefon;
    }
    public int getTelefon(){
        return telefon;
    }
    //metodes
    @Override
    public String toString(){
        StringBuilder sB=new StringBuilder();
        String s;
        sB.append(getNia()).append("\t");
        sB.append(getNom()).append("\t");
        sB.append(getCognom()).append("\t");
        sB.append(getDataNaiximent()).append("\t");
        sB.append(getGrup()).append("\t");
        sB.append(getTelefon()).append("\t");
        s=sB.toString();
        return s;
    }
    public void crearAlumne(){
        Alumne aux;
        boolean condicion;
        String any;
        String mes;
        String dia; 
        do{
            condicion=false;
            System.out.print("\u001B[H\u001B[2JIntroduzca el NIA: ");
            nia=Principal.lec.nextInt();
            Principal.lec.nextLine();
            for(int i=0; i<Principal.contador; i++){
                if(Principal.alumnos[i].getNia()==nia){
                    System.out.println("\u001B[31mDato erroneo...,"
                    +" el NIA no puede repetirse....\u001B[0m");
                    condicion=true;
                    System.out.print("Pulse intro para rellenar de nuevo: ");
                    Principal.lec.nextLine();
                }
            }
        }while(condicion);
        System.out.print("Introduzca el nombre: ");
        nom=Principal.lec.nextLine();
        nom=nom.substring(0,1).toUpperCase()+nom.substring(1);
        System.out.print("Introduzca los apellidos: ");
        cognom=Principal.lec.nextLine();
        cognom=cognom.substring(0,1).toUpperCase()+cognom.substring(1);
        do{
            System.out.print("Introduzca la fecha de nacimiento: ");
            dataNaiximent=Principal.lec.nextLine();
            if(dataNaiximent.length()!=10){
                System.out.println("\u001B[31mDato erroneo...,"
                    +" La fecha es incorrecta, introduzca en  formato(DD/MM/AAAA)\u001B[0m");
                    condicion=true;
                    System.out.print("Pulse intro para continuar: ");
                    Principal.lec.nextLine();
            }
        }while(dataNaiximent.length()>10||dataNaiximent.length()<10);
        do{
            System.out.print("Introduzca el grupo: ");
            grup=Principal.lec.nextLine();
            if(grup.length()==5){
                grup=grup.substring(0,2)+grup.substring(2,5).toUpperCase();
            }
            else{
                System.out.println("\u001B[31mGrupo incorrecto...\u001B[0m");
                System.out.print("Pulse intro para continuaar: ");
                Principal.lec.nextLine();
            }
        }while(grup.length()!=5);
        System.out.print("Introduzca el telefono: ");
        telefon=Principal.lec.nextInt();
        Principal.lec.nextLine();
        System.out.println();
        aux=new Alumne(); 
        aux.setNia(nia);
        aux.setNom(nom);
        aux.setCognom(cognom);
        aux.setDataNaiximent(dataNaiximent);
        aux.setGrup(grup);
        aux.setTelefon(telefon);
        Principal.alumnos[Principal.contador]=aux;
        Principal.contador++;
    }
    public void crearAlumneAleatori(){
        int n;
        Alumne aux;
        String []noms={"Pepe","Juan","Maria","Paulina","Colet","Violet","Pam","Carlos"};
        String []cognoms={"Ramirez","Rodenas","Guarde","Ramos","Moll","Pastor","Rossel"};
        String []dates={"15-08-1982","12-04-2000","25-06-2010","12-02-2004"};
        String []grups={"1ºDAM","2ºDAM","1ºSMX","2ºSMX"};
        System.out.print("Cuantos desea añadir?: ");
        n=Principal.lec.nextInt();
        Principal.lec.nextLine();
        for(int i=0; i<n; i++){
            nom=noms[Lib.random(0, noms.length-1)];
            cognom=cognoms[Lib.random(0, cognoms.length-1)];
            dataNaiximent=dates[Lib.random(0,dates.length-1)];
            grup=grups[Lib.random(0, grups.length-1)];
            telefon=Lib.random(600000000, 699999999);
            aux=new Alumne();
            aux.setNia(Principal.contador+1);
            aux.setNom(nom);
            aux.setCognom(cognom);
            aux.setDataNaiximent(dataNaiximent);
            aux.setGrup(grup);
            aux.setTelefon(telefon);
            Principal.alumnos[Principal.contador]=aux;
            Principal.contador++;
        }
        Lib.barraCarrega(n);
        System.out.print("Alumnos generados, pulse intro para continuar: ");
        Principal.lec.nextLine();
    }
    public void mostrarAlumnes(){
        System.out.println("\u001B[H\u001B[2J");
        cabecera();
        for(int i=0; i<Principal.contador; i++){
                System.out.println(Principal.alumnos[i].toString());
        }
    }
    public void mostrarPorGrupo(){
        String grupo;
        int coincidencias=0;
        System.out.print("\u001B[H\u001B[2JIntroduzca el grupo: ");
        grupo = Principal.lec.nextLine();
        System.out.println("\u001B[4mAlumnos del grupo: " + grupo+"\u001B[0m\n");
        cabecera();
        for(int i = 0; i<Principal.contador; i++){
            if(Principal.alumnos[i].getGrup().equalsIgnoreCase(grupo)){
                System.out.println(Principal.alumnos[i].toString());
                coincidencias++;
            }
        }
        if(coincidencias==0){
            System.out.println("\n\n\u001B[31mNingun alumno tiene este grupo...\u001B[0m\n");
        }
    }
    public void mostrarPorEdad(){
        int edad=0;
        int calcularEdad=0;
        int dia;
        int mes;
        int año;
        int coincidencias=0;
        GregorianCalendar fechaCompleta;
        System.out.print("\u001B[H\u001B[2JIntroduzca la edad: ");
        edad = Principal.lec.nextInt();
        Principal.lec.nextLine();
        System.out.println("\u001B[4mAlumnos de " + edad + " años son:\u001B[0m\n");
        cabecera();
        for(int i = 0; i<Principal.contador; i++){
            dia=Integer.parseInt(Principal.alumnos[i].getDataNaiximent().substring(0,2));
            mes=Integer.parseInt(Principal.alumnos[i].getDataNaiximent().substring(3,5));
            año=Integer.parseInt(Principal.alumnos[i].getDataNaiximent().substring(6,10));
            fechaCompleta=new GregorianCalendar(año,mes,dia);
            calcularEdad=Lib.calcularEdad(fechaCompleta);
            if(calcularEdad==edad){
                System.out.println(Principal.alumnos[i].toString());
                coincidencias++;
            }
        }
        if(coincidencias==0){
            System.out.println("\n\n\u001B[31mNingun alumno tiene esta edad...\u001B[0m");
        }
    }
    public void mostrarPorNia(){
        int nia=0;
        int coincidencias=0;
        System.out.print("\u001B[H\u001B[2JIntroduzca el NIA: ");
        nia = Principal.lec.nextInt();
        Principal.lec.nextLine();
        System.out.println("\u001B[4mEl alumno con NIA "+nia+" es:\u001B[0m\n");
        cabecera();
        for(int i = 0; i<Principal.contador; i++){
            if(Principal.alumnos[i].getNia()==nia){
                System.out.println(Principal.alumnos[i].toString());
                coincidencias++;
            }
        }
        if(coincidencias==0){
            System.out.println("\n\n\u001B[31mNingun alumno tiene este NIA...\u001B[0m");
        }
    }
    public void mostrarPorApellidos(){
        String apellido="";
        int coincidencias=0;
        System.out.print("\u001B[H\u001B[2JIntroduzca el apellido: ");
        apellido = Principal.lec.nextLine();
        System.out.println("\u001B[4mlos alumnos con apellido "+apellido+" es:\u001B[0m\n");
        cabecera();
        for(int i = 0; i<Principal.contador; i++){
            if(Principal.alumnos[i].getCognom().equalsIgnoreCase(apellido)){
                System.out.println(Principal.alumnos[i].toString());
                coincidencias++;
            }
        }
        if(coincidencias==0){
            System.out.println("\n\n\u001B[31mNingun alumno tiene este apellido...\u001B[0m");
        }
    }
    public void removerAlumno(){
        int nia;
        String c="";
        String s="s";
        String n="n";
        boolean condicion=false;
        System.out.print("\u001B[H\u001B[2JIntroduzca el nia del alumno que desea dar de baja: ");
        nia=Principal.lec.nextInt();
        Principal.lec.nextLine();
        for(int i=0; i<Principal.contador; i++){
            if(Principal.alumnos[i].getNia()==nia){
                do{
                    System.out.print("Desea remover? pulse \"S\" para si o \"N\" para no: ");
                    c=Principal.lec.nextLine();
                    if(c.equalsIgnoreCase(s)){
                        System.out.print("Alumno "+"\"\u001B[33m"+Principal.alumnos[i].getNom()+" "+Principal.alumnos[i].getCognom() 
                        +"\u001B[0m\""+" removido, pulse intro para continuar: ");
                        Principal.lec.nextLine();
                        for (int j = i; j < Principal.contador- 1; j++) {
                            Principal.alumnos[j] = Principal.alumnos[j+1];
                        }
                        i=Principal.alumnos.length;
                        condicion=false;
                        Principal.contador--;
                    }
                    else if(c.equalsIgnoreCase(n)){
                        System.out.print("Saliendo...Intro para continuar");
                        Principal.lec.nextLine();
                        i=Principal.alumnos.length;
                        condicion=false;
                    }
                    else{
                        System.out.println("\u001B[31mDato erroneo...,"
                        +" tiene que introducir \"S\" o \"N\"\u001B[0m");
                        System.out.print("Pulse intro para introducir un dato correcto: ");
                        Principal.lec.nextLine();
                        condicion=true;
                    }
                }while(condicion);
            }
        }
    }
    public void cabecera(){
        System.out.println("\u001B[4mNIA     NOMBRE  APELLIDO F.NACIM.       GRUPO   TELEFONO\u001B[0m");
    }
}