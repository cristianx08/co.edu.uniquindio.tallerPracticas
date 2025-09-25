package co.edu.uniquindio.tallerPracticas.model;
import java.util.ArrayList;
import co.edu.uniquindio.tallerPracticas.model.Estudiante;
import java.util.Scanner;
public class Universidad {

    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private ArrayList<Docente> listaDocentes = new ArrayList<>();
    private Rector rector;

    public Universidad() {

    }
    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public boolean crearEstudiante(Universidad universidad) {
        String identificacion = leerStringConsola("Ingrese el numero de identificacion: ");
        Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
        if(estudianteEncontrado == null) {
            String nombre = leerStringConsola("Ingrese el nombre del estudiante: ");
            String apellido = leerStringConsola("Ingrese el apellido: ");
            int edad = leerEntero("Ingrese la edad: ");
            String correo = leerStringConsola("Ingrese el correo: ");
            String semestre = leerStringConsola("Ingrese el semestre: ");
            double nota1 = leerDoubleConsola("Ingrese la nota 1: ");
            double nota2 = leerDoubleConsola("Ingrese la nota 2: ");
            double nota3 = leerDoubleConsola("Ingrese la nota 3: ");
            double nota4 = leerDoubleConsola("Ingrese la nota 4: ");
            double nota5 = leerDoubleConsola("Ingrese la nota 5: ");

            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, identificacion, edad, correo,
                                        semestre, nota1, nota2, nota3, nota4, nota5);
            universidad.getListaEstudiantes().add(nuevoEstudiante);

            return true;
        } else {
            return false;
        }
    }
    public Estudiante obtenerEstudiante(String identificacion) {
        Estudiante estudianteEncontrado =  null;
        for (Estudiante estudiante : getListaEstudiantes()) {
            if(estudiante.getIdentificacion().equalsIgnoreCase(identificacion)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        return estudianteEncontrado;
    }
    public boolean eliminarEstudiante(String identificacion) {
        Estudiante estudiante = obtenerEstudiante(identificacion);
        if(estudiante != null) {
            listaEstudiantes.remove(estudiante);
            return true;
        }
        return false;
    }
    public boolean crearDocente(Universidad universidad) {
        String correo = leerStringConsola("Ingrese el correo del docente: ");
        Docente docenteEncontrado = obtenerDocente(correo);

        if (docenteEncontrado == null) {
            String nombre = leerStringConsola("Ingrese el nombre del docente: ");
            String apellido = leerStringConsola("Ingrese el apellido: ");
            int edad = leerEntero("Ingrese la edad: ");

            Docente docente = new Docente(nombre, apellido, edad, correo);
            universidad.getListaDocentes().add(docente);

            return true;
        } else {
            return false;
        }
    }
    public Docente obtenerDocente(String correo) {
        for (Docente docente : listaDocentes) {
            if (docente.getCorreoElectronico().equalsIgnoreCase(correo)) {
                return docente;
            }
        }
        return null;
    }
    public boolean eliminarDocente(String correo) {
        Docente docente = obtenerDocente(correo);
        if (docente != null) {
            listaDocentes.remove(docente);
            return true;
        }
        return false;
    }
    public boolean crearCurso(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del curso: ");
        String grupo = leerStringConsola("Ingrese el grupo del curso: ");

        Curso cursoEncontrado = obtenerCurso(nombre, grupo);
        if (cursoEncontrado == null) {
            String semestre = leerStringConsola("Ingrese el semestre: ");
            int creditos = leerEntero("Ingrese los créditos: ");
            String jornada = leerStringConsola("Ingrese la jornada: ");

            Curso curso = new Curso(nombre, semestre, grupo, creditos, jornada);
            universidad.getListaCursos().add(curso);
            return true;
        } else {
            return false;
        }
    }
    public Curso obtenerCurso(String nombre, String grupo) {
        for (Curso curso : listaCursos) {
            if (curso.getNombre().equalsIgnoreCase(nombre) &&
                    curso.getGrupo().equalsIgnoreCase(grupo)) {
                return curso;
            }
        }
        return null;
    }
    public boolean eliminarCurso(String nombre, String grupo) {
        Curso curso = obtenerCurso(nombre, grupo);
        if (curso != null) {
            listaCursos.remove(curso);
            return true;
        }
        return false;
    }
    public boolean actualizarEstudiante(String identificacion) {
        Estudiante estudiante = obtenerEstudiante(identificacion);

        if (estudiante == null) {
            System.out.println("No se encontró un estudiante con esa identificación.");
            return false;
        }

        System.out.println("Estudiante encontrado: " + estudiante);
        System.out.println("Ingrese los nuevos datos (deje vacío para no modificar):");

        String nombre = leerStringConsola("Nuevo nombre: ");
        if (!nombre.isEmpty()) {
            estudiante.setNombre(nombre);
        }

        String apellido = leerStringConsola("Nuevo apellido: ");
        if (!apellido.isEmpty()) {
            estudiante.setApellido(apellido);
        }

        String correo = leerStringConsola("Nuevo correo: ");
        if (!correo.isEmpty()) {
            estudiante.setCorreoElectronico(correo);
        }

        String edadStr = leerStringConsola("Nueva edad: ");
        if (!edadStr.isEmpty()) {
            estudiante.setEdad(Integer.parseInt(edadStr));
        }

        String semestre = leerStringConsola("Nuevo semestre: ");
        if (!semestre.isEmpty()) {
            estudiante.setSemestre(semestre);
        }
        String n1 = leerStringConsola("Nueva nota 1: ");
        if (!n1.isEmpty()) {
            estudiante.setNota1(Double.parseDouble(n1));
        }
        String n2 = leerStringConsola("Nueva nota 2: ");
        if (!n2.isEmpty()) {
            estudiante.setNota2(Double.parseDouble(n2));
        }
        String n3 = leerStringConsola("Nueva nota 3: ");
        if (!n3.isEmpty()) {
            estudiante.setNota3(Double.parseDouble(n3));
        }
        String n4 = leerStringConsola("Nueva nota 4: ");
        if (!n4.isEmpty()) {
            estudiante.setNota4(Double.parseDouble(n4));
        }
        String n5 = leerStringConsola("Nueva nota 5: ");
        if (!n5.isEmpty()) {
            estudiante.setNota5(Double.parseDouble(n5));
        }

        System.out.println("Estudiante actualizado correctamente: " + estudiante);
        return true;
    }
    public boolean actualizarDocente(String nombreDocente) {
        Docente docente = obtenerDocente(nombreDocente);

        if (docente == null) {
            System.out.println("No se encontró un docente con ese nombre.");
            return false;
        }

        System.out.println("Docente encontrado: " + docente);
        System.out.println("Ingrese los nuevos datos (deje vacío para no modificar):");

        String nuevoNombre = leerStringConsola("Nuevo nombre: ");
        if (!nuevoNombre.isEmpty()) {
            docente.setNombre(nuevoNombre);
        }

        String apellido = leerStringConsola("Nuevo apellido: ");
        if (!apellido.isEmpty()) {
            docente.setApellido(apellido);
        }

        String correo = leerStringConsola("Nuevo correo: ");
        if (!correo.isEmpty()) {
            Docente otro = obtenerDocente(correo);
            if (otro == null || otro == docente) {
                docente.setCorreoElectronico(correo);
            } else {
                System.out.println("El correo ya esta en uso por otro docente. No es posible actualizar el correo.");
            }
        }

        String edadStr = leerStringConsola("Nueva edad: ");
        if (!edadStr.isEmpty()) {
            docente.setEdad(Integer.parseInt(edadStr));
        }

        System.out.println("Docente actualizado correctamente: " + docente);
        return true;
    }
    public boolean actualizarCurso(String nombre, String grupo) {
        Curso curso = obtenerCurso(nombre, grupo);

        if (curso == null) {
            System.out.println("No se encontró un curso con los datos ingresados.");
            return false;
        }

        System.out.println("Curso encontrado: " + curso);
        System.out.println("Ingrese los nuevos datos (deje vacío para no modificar):");

        String nuevoNombre = leerStringConsola("Nuevo nombre del curso: ");
        if (!nuevoNombre.isEmpty()) {
            curso.setNombre(nuevoNombre);
        }
        String nuevoSemestre = leerStringConsola("Nuevo semestre: ");
        if(!nuevoSemestre.isEmpty()) {
            curso.setSemestre(nuevoSemestre);
        }
        String nuevoGrupo = leerStringConsola("Nuevo grupo: ");
        if(!nuevoGrupo.isEmpty()) {
            curso.setGrupo(nuevoGrupo);
        }
        String nuevaJornada = leerStringConsola("Nueva jornada: ");
        if(!nuevaJornada.isEmpty()) {
            curso.setJornada(nuevaJornada);
        }
        String creditosStr = leerStringConsola("Nuevos créditos: ");
        if (!creditosStr.isEmpty()) {
            curso.setCreditos(Integer.parseInt(creditosStr));
        }

        System.out.println("Curso actualizado correctamente: " + curso);
        return true;
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
    public static double leerDoubleConsola(String mensaje) {
        double dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Double.parseDouble(captura);
        return dato;
    }
}
