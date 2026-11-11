import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventarioServicio servicio = new InventarioServicio();
        
        System.out.println("--- MÓDULO DE GESTIÓN INICIALIZADO ---");
        System.out.print("Ingrese ID del producto: ");
        String id = scanner.nextLine();
        
        System.out.print("Ingrese Nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese Precio: ");
        double precio = scanner.nextDouble();

        boolean exito = servicio.agregarItem(id, nombre, precio);
        
        if (exito) {
            System.out.println("¡Elemento registrado con éxito!");
            System.out.println("Inventario actual: " + servicio.obtenerTodos());
        } else {
            System.out.println("Error: El precio no puede ser negativo o cero.");
        }
        
        scanner.close();
    }
}
