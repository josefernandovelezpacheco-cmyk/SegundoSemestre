| public class EjecutarLibro {
    public static void main(String[] args) {
        // Crear 5 libros diferentes
        Libro libro1 = new Libro("978-3-16-148410-0", "El Gran Gatsby", "F. Scott Fitzgerald", 1925, true);
        Libro libro2 = new Libro("978-0-14-028333-4", "1984", "George Orwell", 1949, true);
        Libro libro3 = new Libro("978-0-7432-7356-5", "To Kill a Mockingbird", "Harper Lee", 1960, true);
        Libro libro4 = new Libro("978-0-452-28423-4", "Pride and Prejudice", "Jane Austen", 1813, true);
        Libro libro5 = new Libro("978-0-06-112008-4", "The Catcher in the Rye", "J.D. Salinger", 1951, true);

        System.out.println("Información de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);


        //mostrar solo el titulo del libro 2
        System.out.println(libro2.getTitulo());

        //cambiar el isbn del libro 5
        libro5.setIsbn("0000-00");
        System.out.println(libro5);

        //verificar si el libro 3 está disponible para préstamo
        System.out.println(libro3.estaDisponible());  //esta disponible

        //prestar el libro 3
        libro3.prestar();  //prestar el libro 3
        System.out.println(libro3.estaDisponible());  //no está disponible

        //devolver el libro 3
        libro3.setDisponible(true);  //devolver el libro 3
        System.out.println(libro3.estaDisponible());  //está disponible

    }
}
