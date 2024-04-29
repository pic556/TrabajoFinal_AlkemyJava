package alkemytpi;
import java.util.Scanner;


/*Precondiciones:
 * ISBN funcionara como indice de la lista de inventarios iniciando en 0
 * 
 * 
 * */
public class main {

    public static void main(String[] args) {
                
        Usuario usuario = new Usuario().CrearUsuario();
        usuario.informacionUsuario();
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\r\n");;
        Inventario inventario = new Inventario().CrearInventario();
        inventario.verInventarios();

        int opcion;
        do {
            System.out.println("\n===== Biblioteca Digital =====");
            System.out.println("1. Agregar libro al inventario");
            System.out.println("2. Solicitar préstamo");
            System.out.println("3. Devolver libro");
            System.out.println("4. Buscar libro");            
            System.out.println("5. Ver Libreria");
            System.out.println("6. Ver Usuario");
            System.out.println("7. Salir");
            System.out.print("\nIngrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n=== Agregar libro al inventario ===");
                    inventario.verInventarios();
                    Libro libro = new Libro().crearLibro();
                    inventario.recibirLibroInventario(libro);
                    System.out.println("\nLibro agregado al inventario exitosamente.");
                    inventario.verInventarios();
                    break;
                case 2:
                    System.out.println("\n=== Solicitar préstamo ===");
                    System.out.println("\nIngrese el título, autor o género del libro que desea solicitar préstamo:");
                    scanner.nextLine();
                    System.out.println("\ntitulo");
                    String busquedaLibro1a = scanner.nextLine();
                    System.out.println("\nAutor");
                    String busquedaLibro2a = scanner.nextLine();
                    System.out.println("\nGenero");
                    String busquedaLibro3a = scanner.nextLine();
                    inventario.buscar(busquedaLibro1a, busquedaLibro2a, busquedaLibro3a);                   
                    System.out.print("\nIngrese el índice/ISBN del libro que desea solicitar préstamo: ");
                    int indicePrestamo = scanner.nextInt();
                    System.out.println();
                    Libro libroPrestado = inventario.PrestarLibro(indicePrestamo);
                    usuario.RecibirLibro(libroPrestado);
                    System.out.println();
                    System.out.println("\nLibro prestado exitosamente.");
                    System.out.println("\nver ahora el inventario");
                    System.out.println();
                    inventario.verInventarios();
                    System.out.println();
                    System.out.println("Ver lo que tiene el usuario");
                    usuario.informacionUsuario();
                    break;
                case 3:
                    System.out.println("\n=== Devolver libro ===");
                    System.out.println("Ver lo que tiene el usuario");
                    usuario.informacionUsuario();
                    System.out.println("\nIngrese el indice/ISBN del libro que desea devolver:");
                    scanner.nextLine(); 
                    int indiceLibroAdevolver = scanner.nextInt();
                    Libro libroDevuelto = usuario.DevolverLibro(indiceLibroAdevolver);
                    inventario.recibirDevueltaLibroInventario(libroDevuelto);
                    System.out.println("\nLibro devuelto exitosamente.");
                    inventario.verInventarios();
                    break;
                case 4:
                    System.out.println("\n=== Buscar libro ===");
                    System.out.println("Ingrese el título, autor o género del libro que desea buscar:");
                    scanner.nextLine();
                    System.out.println("\ntitulo");
                    String busquedaLibro1 = scanner.nextLine();
                    System.out.println("\nAutor");
                    String busquedaLibro2 = scanner.nextLine();
                    System.out.println("\nGenero");
                    String busquedaLibro3 = scanner.nextLine();
                    inventario.buscar(busquedaLibro1, busquedaLibro2, busquedaLibro3);
                    break;               
                case 5:
                	System.out.println("\n=== Ver Libreria ===");
                	 inventario.verInventarios();
                	 break;
                case 6:
                	 System.out.println("\n=== Ver al Usuario ===");
                     usuario.informacionUsuario();
                     break;
                case 7:
                    System.out.println("\nGracias por utilizar la Biblioteca Digital. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 7);
        scanner.close(); // Cerrar el Scanner al salir del programa
    }
}
