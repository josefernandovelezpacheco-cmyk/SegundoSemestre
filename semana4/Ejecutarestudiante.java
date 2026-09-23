package semana4;

public class Ejecutarestudiante {
    
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan", 12345, 4.0, 3.5, 4.2);

        if (estudiante.aprobo()) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante no aprobó.");
        }
        estudiante.mostrarInformacion(); 
    }
}

