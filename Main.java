import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear algunos libros para la biblioteca
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", 3, 0);
        Libro libro3 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 4, 1);
        
        int opcion = 0;
        
        System.out.println("Bienvenido a la Biblioteca");
        
        while (opcion != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver libros");
            System.out.println("2. Pedir libro prestado");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt();
            
            if (opcion == 1) {
                // Mostrar todos los libros
                System.out.println("\n--- LIBROS EN LA BIBLIOTECA ---");
                System.out.println("1.");
                System.out.println(libro1.toString());
                if (libro1.hayDisponibilidad()) {
                    System.out.println("Estado: DISPONIBLE");
                } else {
                    System.out.println("Estado: NO DISPONIBLE");
                }
                
                System.out.println("\n2.");
                System.out.println(libro2.toString());
                if (libro2.hayDisponibilidad()) {
                    System.out.println("Estado: DISPONIBLE");
                } else {
                    System.out.println("Estado: NO DISPONIBLE");
                }
                
                System.out.println("\n3.");
                System.out.println(libro3.toString());
                if (libro3.hayDisponibilidad()) {
                    System.out.println("Estado: DISPONIBLE");
                } else {
                    System.out.println("Estado: NO DISPONIBLE");
                }
            }
            
            if (opcion == 2) {
                // Pedir libro prestado
                System.out.println("\n--- PEDIR LIBRO PRESTADO ---");
                System.out.println("¿Qué libro quieres pedir?");
                System.out.println("1. " + libro1.getTitulo());
                System.out.println("2. " + libro2.getTitulo());
                System.out.println("3. " + libro3.getTitulo());
                System.out.print("Elige el número: ");
                
                int seleccion = entrada.nextInt();
                
                if (seleccion == 1) {
                    if (libro1.prestamo()) {
                        System.out.println("Préstamo exitoso de: " + libro1.getTitulo());
                    } else {
                        System.out.println("No hay ejemplares disponibles");
                    }
                } else if (seleccion == 2) {
                    if (libro2.prestamo()) {
                        System.out.println("Préstamo exitoso de: " + libro2.getTitulo());
                    } else {
                        System.out.println("No hay ejemplares disponibles");
                    }
                } else if (seleccion == 3) {
                    if (libro3.prestamo()) {
                        System.out.println("Préstamo exitoso de: " + libro3.getTitulo());
                    } else {
                        System.out.println("No hay ejemplares disponibles");
                    }
                } else {
                    System.out.println("Opción no válida");
                }
            }
            
            if (opcion == 3) {
                // Devolver libro
                System.out.println("\n--- DEVOLVER LIBRO ---");
                System.out.println("¿Qué libro quieres devolver?");
                System.out.println("1. " + libro1.getTitulo());
                System.out.println("2. " + libro2.getTitulo());
                System.out.println("3. " + libro3.getTitulo());
                System.out.print("Elige el número: ");
                
                int seleccion = entrada.nextInt();
                
                if (seleccion == 1) {
                    if (libro1.devolucion()) {
                        System.out.println("Devolución exitosa de: " + libro1.getTitulo());
                    } else {
                        System.out.println("No hay libros prestados para devolver");
                    }
                } else if (seleccion == 2) {
                    if (libro2.devolucion()) {
                        System.out.println("Devolución exitosa de: " + libro2.getTitulo());
                    } else {
                        System.out.println("No hay libros prestados para devolver");
                    }
                } else if (seleccion == 3) {
                    if (libro3.devolucion()) {
                        System.out.println("Devolución exitosa de: " + libro3.getTitulo());
                    } else {
                        System.out.println("No hay libros prestados para devolver");
                    }
                } else {
                    System.out.println("Opción no válida");
                }
            }
            
            if (opcion == 4) {
                System.out.println("Gracias por usar la biblioteca!");
            }
            
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida, intenta de nuevo");
            }
        }
        
        entrada.close();
    }
}