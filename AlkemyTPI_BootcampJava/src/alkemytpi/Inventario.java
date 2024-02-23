package alkemytpi; 

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	public ArrayList<Libro> ListadoInventario;
	
	public Inventario(){}
	
	public Inventario(ArrayList<Libro> ListadoInventario) {
		this.ListadoInventario = ListadoInventario;
	}
	
	public Inventario CrearInventario() {
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
		int largo;		
		System.out.println("INGRESAR Cantidad de libro al inventario: ");
    	largo = scan.nextInt();
    	ListadoInventario = new ArrayList<Libro>(largo);
		for (int i = 1; i <= largo ; i++) {
			Libro lib = new Libro();
			lib = lib.crearLibro();
			ListadoInventario.add(lib);
		}
		
		Inventario inv = new Inventario(ListadoInventario);
		return inv;
	}
	
	
	public void verInventarios() {
		for (Libro libro : ListadoInventario) {
			libro.infoLibro();
			System.out.println();
		}
	}
	

	
	public Libro PrestarLibro(int indiceInventario) {
		ArrayList<Libro> copiando = ListadoInventario;
		ListadoInventario.get(indiceInventario).Dispobinilidad = "n";
		return copiando.get(indiceInventario);
		
	}
	
	public void recibirLibroInventario(Libro libro) {
        ListadoInventario.add(libro);
    }
	
	public void recibirDevueltaLibroInventario(Libro L) {
		int index = ListadoInventario.indexOf(L);

		ListadoInventario.get(index).Dispobinilidad = "s";
	}
	
	
	public  ArrayList<Libro> buscar(String Titulo, String Autor, String Genero) {
	    ArrayList<Libro> buscados = new ArrayList<Libro>();

	    for (Libro libro : ListadoInventario) {
	        if (libro.Autor.equalsIgnoreCase(Autor) || 
	            libro.Titulo.equalsIgnoreCase(Titulo) ||
	            libro.Genero.equalsIgnoreCase(Genero)) {
	            buscados.add(libro);
	        }
	    }

	    if (!buscados.isEmpty()) {
	        System.out.println("\nLibros encontrados:");
	        for (Libro libroEncontrado : buscados) {
	            libroEncontrado.infoLibro();
	            System.out.println();
	        }
	    } else {
	        System.out.println("\nNo se encontraron libros con los criterios de búsqueda.");
	    }
	    return buscados;
	}

}
