package co.edu.uniquindio.tallerPracticas;

import co.edu.uniquindio.tallerPracticas.model.Universidad;
import co.edu.uniquindio.tallerPracticas.model.Estudiante;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inicializarDatos();
    }

    public static void inicializarDatos() {
        Estudiante estudiante1 = new Estudiante("Cristian Cruz",
                19,
                "cristiancruz@gmail.com",
                "2do semestre",
                3.5,
                4.0,
                3.0
        );
        Estudiante estudiante2 = new Estudiante("Felipe Arbelaez",
                23,
                "felipearbelaez12@gmail.com",
                "2do semestre",
                3.0,
                4.2,
                2.7
        );
        Estudiante estudiante3 = new Estudiante("Daniel Valencia",
                18,
                "valenciadeniel88@gmail.com",
                "2do semestre",
                1.8,
                5.0,
                2.2
        );
    }
    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }
    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }
    public static double leerDoubleConsola(String mensaje)
    {
        double dato=0;
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato=Double.parseDouble(captura);
        return dato;
    }
}