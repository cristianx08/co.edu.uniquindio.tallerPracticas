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
        return estudiante.calcularNotaDefinitiva();
    }
    public double calcularPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        double nota1 = calcularDefinitivaEstudiante(estudiante1);
        double nota2 = calcularDefinitivaEstudiante(estudiante2);
        double nota3 = calcularDefinitivaEstudiante(estudiante3);
        return (nota1 + nota2 + nota3) / 3;
    }
    public double calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {
        int edad1 = estudiante1.getEdad();
        int edad2 = estudiante2.getEdad();
        int edad3 = estudiante3.getEdad();
        return (edad1 + edad2 + edad3) / 3;
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
