package co.edu.uniquindio.tallerPracticas;
import co.edu.uniquindio.tallerPracticas.model.Universidad;
import co.edu.uniquindio.tallerPracticas.model.Estudiante;
import co.edu.uniquindio.tallerPracticas.model.Docente;
import co.edu.uniquindio.tallerPracticas.model.Curso;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = inicializarDatos();

        Estudiante estudiante = universidad.getListaEstudiantes().get(0);
        estudiante.getOwnedByUniversidad();
        mostrarMenuPrincipal(universidad);
    }
    private static void mostrarMenuPrincipal(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gestionar estudiantes");
            System.out.println("2. Gestionar docentes");
            System.out.println("3. Gestionar cursos");
            System.out.println("4. Salir");

            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1 -> mostrarMenuEstudiantes(universidad);
                case 2 -> mostrarMenuDocentes(universidad);
                case 3 -> mostrarMenuCursos(universidad);
                case 4 -> System.out.println("Cerrando sistema...");
                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
    private static void mostrarMenuEstudiantes(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Obtener estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Listar estudiantes");
            System.out.println("5. Actualizar Datos");
            System.out.println("6. Regresar");

            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion){
                case 1 -> {
                    boolean creado = universidad.crearEstudiante(universidad);
                    System.out.println(creado ? "Estudiante creado exitosamente." : "El estudiante ya existe.");
                }
                case 2 -> {
                    String id = leerStringConsola("Ingrese el numero de identificacion del estudiante que desea buscar.");
                    Estudiante est = universidad.obtenerEstudiante(id);
                    System.out.println(est != null ? est : "Estudiante no encontrado.");
                }
                case 3 -> {
                    String id = leerStringConsola("Ingrese el numero de identificacion del estudiante que desea eliminar.");
                    boolean eliminado = universidad.eliminarEstudiante(id);
                    System.out.println(eliminado ? "Estudiante eliminado con exito." : "Estudiante no encontrado.");
                }
                case 4 -> {
                    System.out.println("Lista de estudiantes: ");
                    for (Estudiante e : universidad.getListaEstudiantes()) {
                        System.out.println(e);
                    }
                }
                case 5 -> {
                    String idActualizar = leerStringConsola("Ingrese la identificacion del estudinate a actualizar: ");
                    boolean actualizado = universidad.actualizarEstudiante(idActualizar);
                    System.out.println( actualizado ? "Estudiante actualizado." : "Estudiante no encontrado.");
                }
                case 6 -> System.out.println("Regresando al menu principal...");
                default -> System.out.println("Opion no valida.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenuDocentes(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- GESTION DE DOCENTES ---");
            System.out.println("1. Crear docente");
            System.out.println("2. Obtener docente");
            System.out.println("3. Eliminar docente");
            System.out.println("4. Listar docentes");
            System.out.println("5. Actualizar Datos");
            System.out.println("6. Regresar");

            opcion = leerEntero("Seleccione una opcion: ");
            switch (opcion) {
                case 1 -> {
                    boolean creado = universidad.crearDocente(universidad);
                    System.out.println(creado ? "Docente creado exitosamente." : "El docente ya existe.");
                }
                case 2 -> {
                    String id = leerStringConsola("Ingrese la identificacion del docente que desea buscar.");
                    Docente doc = universidad.obtenerDocente(id);
                    System.out.println(doc != null ? doc : "Docente no encontrado.");
                }
                case 3 -> {
                    String id = leerStringConsola("Ingrese la identificacion del docente que desea eliminar.");
                    boolean eliminado = universidad.eliminarDocente(id);
                    System.out.println(eliminado ? "Docente eliminado con exito." : "Docente no encontrado.");
                }
                case 4 -> {
                    System.out.println("Lista de docentes: ");
                    for (Docente doce : universidad.getListaDocentes()) {
                        System.out.println(doce);
                    }
                }
                case 5 -> {
                    String id = leerStringConsola("Ingrese la identificacion del docente a actualizar :");
                    boolean actualizado = universidad.actualizarDocente(id);
                    System.out.println(actualizado ? "Docente actualizado." : "Docente no encontrado.");
                }
                case 6 -> System.out.println("Regresando al menu principal...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
    }
    private static void mostrarMenuCursos(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE CURSOS ---");
            System.out.println("1. Crear curso");
            System.out.println("2. Obtener curso");
            System.out.println("3. Eliminar curso");
            System.out.println("4. Listar cursos");
            System.out.println("5. Actualizar curso");
            System.out.println("6. Regresar");

            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> {
                    boolean creado = universidad.crearCurso(universidad);
                    System.out.println(creado ? "Curso creado con éxito." : "El curso ya existe.");
                }
                case 2 -> {
                    String nombre = leerStringConsola("Ingrese el nombre del curso: ");
                    String grupo = leerStringConsola("Ingrese el grupo del curso: ");
                    Curso curso = universidad.obtenerCurso(nombre, grupo);
                    System.out.println(curso != null ? curso : "Curso no encontrado.");
                }
                case 3 -> {
                    String nombre = leerStringConsola("Ingrese el nombre del curso a eliminar: ");
                    String grupo = leerStringConsola("Ingrese el grupo del curso: ");
                    boolean eliminado = universidad.eliminarCurso(nombre, grupo);
                    System.out.println(eliminado ? "Curso eliminado." : "Curso no encontrado.");
                }
                case 4 -> {
                    System.out.println("Lista de cursos:");
                    for (Curso c : universidad.getListaCursos()) {
                        System.out.println(c);
                    }
                }
                case 5 -> {
                    String nombre = leerStringConsola("Ingrese el nombre del curso a actualizar: ");
                    String grupo = leerStringConsola("Ingrese el grupo del curso a actualizar: ");
                    boolean actualizado = universidad.actualizarCurso(nombre, grupo);
                    System.out.println(actualizado ? "Curso actualizado." : "Curso no encontrado");
                }
                case 6 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static Universidad inicializarDatos() {
        Universidad universidad = new Universidad();
        Estudiante estudiante;
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Cristian");
        estudiante1.setApellido("Cruz");
        estudiante1.setIdentificacion("1093456784");
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
        estudiante2.setIdentificacion("16752347895");
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
        estudiante3.setIdentificacion("15670098279");
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
        docente.setApellido("Arias");
        docente.setEdad(64);
        docente.setCorreoElectronico("jhonmariojh777@gmail.com");

        universidad.getListaEstudiantes().add(estudiante1);
        universidad.getListaEstudiantes().add(estudiante2);
        universidad.getListaEstudiantes().add(estudiante3);
        universidad.getListaDocentes().add(docente);

        return universidad;

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
    public static String leerStringConsola(String mensaje) {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }
}