package co.edu.uniquindio.tallerPracticas.model;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private ArrayList<Estudiante>estudiantes;
    private Docente docente;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Curso(String nombre, String semestre, String grupo, int creditos, String jornada) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null && ! estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }
    public void removerEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    public ArrayList<Estudiante>getEstudiantes() {
        return estudiantes;
    }
    public Docente getDocente() {
        return docente;
    }
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    @Override
    public String toString() {
        return "Curso {" +
                "Nombre='" + nombre + '\'' +
                ", Semestre='" + semestre + '\'' +
                ", Grupo='" + grupo + '\'' +
                ", Créditos=" + creditos +
                ", Jornada='" + jornada + '\'' +
                '}';
    }
}
