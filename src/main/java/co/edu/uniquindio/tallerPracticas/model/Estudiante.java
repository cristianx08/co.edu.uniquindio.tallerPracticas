package co.edu.uniquindio.tallerPracticas.model;

public class Estudiante {

    private String nombre;
    private int edad;
    private String correoElectronico;
    private String semestre;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante() {

    }
    public Estudiante(String nombre, int edad, String correoElectronico, String semestre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularNotaDefinitiva() {
        double resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }
    public String obtenerNotas() {
        return "Notas del estudiante " + nombre + ": " + nota1 + " - " + nota2 + " - " + nota3;
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correoElectronico + '\'' +
                ", semestre='" + semestre + '\'' +
                ", nota definitiva=" + String.format("%.2f", calcularNotaDefinitiva()) +
                '}';
    }
}
