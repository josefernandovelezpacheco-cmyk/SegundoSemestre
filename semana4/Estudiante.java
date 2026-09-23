package semana4;

public class  Estudiante {

    // Atributos
    private String nombre;
    private double codigo;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String nombre, double codigo,
                      double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }


    // Métodos
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Promedio: " + calcularPromedio());
    }

    public boolean aprobo() {
        return calcularPromedio() >= 3.0;
    }
}
