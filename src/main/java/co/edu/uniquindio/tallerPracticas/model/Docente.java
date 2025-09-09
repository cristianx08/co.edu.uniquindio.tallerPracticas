package co.edu.uniquindio.tallerPracticas.model;

public class Docente {

    private String nombre;
    private int edad;
    private String correoElectronico;

    public Docente() {

    }

    public Docente(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }
    public double calcularDefinitivaEstudiante(Estudiante estudiante) {
        double definitiva = (estudiante.getNota1() + estudiante.getNota2() + estudiante.getNota3()) / 3;
        return definitiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
