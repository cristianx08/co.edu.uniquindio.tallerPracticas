package co.edu.uniquindio.tallerPracticas;

import co.edu.uniquindio.tallerPracticas.model.Estudiante;
import co.edu.uniquindio.tallerPracticas.model.Docente;
import java.text.DecimalFormat;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        inicializarDatos();
    }
    private static void inicializarDatos() {
        Estudiante estudiante;
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Cristian Cruz");
        estudiante1.setEdad(19);
        estudiante1.setCorreoElectronico("cristiancruz@gmail.com");
        estudiante1.setSemestre("2do semestre");
        estudiante1.setNota1(3.5);
        estudiante1.setNota2(4.0);
        estudiante1.setNota3(3.0);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Felipe Arbelaez");
        estudiante2.setEdad(23);
        estudiante2.setCorreoElectronico("felipearbelaez12@gmail.com");
        estudiante2.setSemestre("2do semestre");
        estudiante2.setNota1(3.0);
        estudiante2.setNota2(4.2);
        estudiante2.setNota3(2.7);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Daniel Valencia");
        estudiante3.setEdad(18);
        estudiante3.setCorreoElectronico("valenciadaniel88@gmail.com");
        estudiante3.setSemestre("2do semestre");
        estudiante3.setNota1(1.8);
        estudiante3.setNota2(5.0);
        estudiante3.setNota3(2.2);

        Docente docente = new Docente();
        docente.setNombre("Jhon");
        docente.setEdad(64);
        docente.setCorreoElectronico("jhonmariojh777@gmail.com");

        mostrarDefinitiva(docente, estudiante1);
        mostrarDefinitiva(docente, estudiante2);
        mostrarDefinitiva(docente, estudiante3);
        mostrarPromedioCurso(docente, estudiante1, estudiante2, estudiante3);
        mostrarPromedioEdad(docente, estudiante1, estudiante2, estudiante3);
    }

    private static void mostrarDefinitiva(Docente docente, Estudiante estudiante) {
        double notaDefinitiva = docente.calcularDefinitivaEstudiante(estudiante);
        System.out.println("Nota definitiva de " + estudiante.getNombre() + ": " + notaDefinitiva);
    }
    private static void mostrarPromedioCurso(Docente docente, Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        double promedio = docente.calcularPromedioCurso(estudiante1, estudiante2, estudiante3);
        System.out.println("Promedio del curso: " + promedio);
    }
    private static void mostrarPromedioEdad(Docente docente, Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        double promedioEdad = docente.calcularPromedioEdad(estudiante1, estudiante2, estudiante3);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Promedio de edad del curso: " + df.format(promedioEdad));
    }

}