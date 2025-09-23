package co.edu.uniquindio.tallerPracticas;
import co.edu.uniquindio.tallerPracticas.model.Universidad;
import co.edu.uniquindio.tallerPracticas.model.Estudiante;
import co.edu.uniquindio.tallerPracticas.model.Docente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = inicializarDatos();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese la opcion del menu");
            switch (opcion) {
                case 1:
                    String resultado = crearEstudiante(universidad);
                    System.out.println("Estudiante creado:  " + resultado);
                    break;
                case 2:
                    eliminarEstudiante(universidad);
                    break;
                case 3:
                    listarEstuiantes(universidad);
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Crear estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("Listar estudiantes");
        System.out.println("0. Salir");
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
    public static double leerDoubleConsola(String mensaje) {
        double dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Double.parseDouble(captura);
        return dato;
    }

    private static String crearEstudiante(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del estudainte: ");
        String apellido = leerStringConsola("Ingrese el apellido: ");
        int edad = leerEntero("Ingrese la edad: ");
        String correo = leerStringConsola("Ingrese el correo: ");
        String semestre = leerStringConsola("Ingrese el semestre: ");
        double nota1 = leerDoubleConsola("Ingrese la nota 1: ");
        double nota2 = leerDoubleConsola("Ingrese la nota 2: ");
        double nota3 = leerDoubleConsola("Ingrese la nota 3: ");
        double nota4 = leerDoubleConsola("Ingrese la nota 4: ");
        double nota5 = leerDoubleConsola("Ingrese la nota 5: ");

        Estudiante nuevo = new Estudiante(nombre, apellido, edad, correo, semestre, nota1, nota2, nota3, nota4, nota5);

        universidad.getListaEstudiantes().add(nuevo);

        return nuevo.toString();
    }

    private static void eliminarEstudiante(Universidad universidad) {

        String nombre = leerStringConsola("Ingrese el nombre del estudiante a eliminar: ");
        Estudiante encontrado = null;

        for (Estudiante e : universidad.getListaEstudiantes()) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = e;
                break;
            }
        }
        if (encontrado != null) {
            universidad.getListaEstudiantes().remove(encontrado);
            System.out.println("Estudiante eliminado con exito.");
        } else {
            System.out.println("No se encontro el estudiante con el nombre ingresado: ");
        }
    }

    private static void listarEstuiantes(Universidad universidad) {

        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (universidad.getListaEstudiantes().isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : universidad.getListaEstudiantes()) {
                System.out.println(e.toString());
            }
        }
    }
    private static Universidad inicializarDatos() {
        Universidad universidad = new Universidad();
        Estudiante estudiante;
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Cristian");
        estudiante1.setApellido("Cruz");
        estudiante1.setEdad(19);
        estudiante1.setCorreoElectronico("cristiancruz@gmail.com");
        estudiante1.setSemestre("2do semestre");
        estudiante1.setNota1(3.5);
        estudiante1.setNota2(4.0);
        estudiante1.setNota3(3.0);
        estudiante1.setNota4(3.3);
        estudiante1.setNota5(2.7);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Felipe");
        estudiante2.setApellido("Arbelaez");
        estudiante2.setEdad(23);
        estudiante2.setCorreoElectronico("felipearbelaez12@gmail.com");
        estudiante2.setSemestre("2do semestre");
        estudiante2.setNota1(3.0);
        estudiante2.setNota2(4.2);
        estudiante2.setNota3(2.7);
        estudiante2.setNota4(2.5);
        estudiante2.setNota5(5.0);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Daniel");
        estudiante3.setApellido("Valencia");
        estudiante3.setEdad(18);
        estudiante3.setCorreoElectronico("valenciadaniel88@gmail.com");
        estudiante3.setSemestre("2do semestre");
        estudiante3.setNota1(1.8);
        estudiante3.setNota2(5.0);
        estudiante3.setNota3(2.2);
        estudiante3.setNota4(4.4);
        estudiante3.setNota5(4.9);

        Docente docente = new Docente();
        docente.setNombre("Jhon");
        docente.setEdad(64);
        docente.setCorreoElectronico("jhonmariojh777@gmail.com");

        universidad.getListaEstudiantes().add(estudiante1);
        universidad.getListaEstudiantes().add(estudiante2);
        universidad.getListaEstudiantes().add(estudiante3);
        universidad.getListaDocentes().add(docente);

        return universidad;

    }

}