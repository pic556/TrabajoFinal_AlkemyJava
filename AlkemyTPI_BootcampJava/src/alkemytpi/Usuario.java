package alkemytpi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class Usuario {
	public String Nombre;
	public long DNI;
	public ArrayList<Libro> ListaLibros;
	
	
	public Usuario(){
		
	}
	
	public Usuario(String Nombre,long DNI,ArrayList<Libro> ListaLibros) {
		this.Nombre = Nombre;
		this.DNI = DNI;
		this.ListaLibros = ListaLibros;
	}
	
	public Usuario CrearUsuario(){
		Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
    	System.out.println("INGRESAR NOMBRE: ");
    	Nombre = scan.next();
    	System.out.println("INGRESAR DNI: ");
    	DNI = scan.nextLong();
    	System.out.println("-----");
    	ListaLibros = new ArrayList<Libro>() ;
    	
    	Usuario usser = new Usuario(Nombre,DNI,ListaLibros);
    	return usser;
	}
	
	
	public void RecibirLibro(Libro L) {
		System.out.print("Libro que recibimos ");
		L.infoLibro();
		ListaLibros.add(L);
		
	}
	public void RecibirListaDeLibro(ArrayList<Libro> LS){
		ListaLibros.addAll(LS);
		
	}
	
	
	public Libro DevolverLibro(int Indice) {
	    // Verificar si el índice está dentro de los límites de la lista
	    if (Indice >= 0 && Indice < ListaLibros.size()) {
	        // Remover el libro de la lista y obtenerlo
	        return ListaLibros.remove(Indice);
	    } else {
	        // Si el índice está fuera de los límites, imprimir un mensaje de error y devolver null
	        System.out.println("Índice inválido. No se puede devolver el libro. ");
	        return null;
	    }
	}

	
	public void informacionUsuario() {
		System.out.println("\nver libros del usuario: " + DNI);
				for (Libro libro : ListaLibros) {
					System.out.println("\nindice de Libro de usarios " + ListaLibros.indexOf(libro) );
					 libro.infoLibro();
				}
	}
}
