package co.edu.uniquindio.tallerPracticas.model;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String identificacion;
    private int edad;
    private String correoElectronico;
    private String semestre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;


    private Universidad ownedByUniversidad;

    public Estudiante() {

    }
    public Estudiante(String nombre, String apellido, String identificacion, int edad,
                      String correoElectronico, String semestre, double nota1,
                      double nota2, double nota3, double nota4, double nota5) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }
    public double calcularNotaDefinitiva() {
        double resultado = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        return resultado;
    }
    public String obtenerNotas() {
        return "Notas del estudiante " + nombre + ": " + nota1 + " - " + nota2 + " - " + nota3 + " - " + nota4 + " - " + nota5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public Universidad getOwnedByUniversidad() {
        return ownedByUniversidad;
    }

    public void setOwnedByUniversidad(Universidad ownedByUniversidad) {
        this.ownedByUniversidad = ownedByUniversidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "Identificación='" + identificacion + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Edad=" + edad +
                ", Correo='" + correoElectronico + '\'' +
                ", Semestre='" + semestre + '\'' +
                ", Nota definitiva=" + calcularNotaDefinitiva() +
                '}';
    }
}
