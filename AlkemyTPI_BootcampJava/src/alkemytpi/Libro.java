package alkemytpi;

import java.util.Scanner;



public class Libro {
    public String Titulo;
    public String Autor;
	public int ISBN;
    public String Genero;
    public String Dispobinilidad;
    
	 public Libro() {
	        
	    }// constructor por defecto
	 
	 public Libro( String Titulo, String Autor, int ISBN,String Genero, String Dispobinilidad) {
		 this.Titulo = Titulo;
	     this.Autor = Autor;
		 this.ISBN = ISBN;
		 this.Genero = Genero;
		 this.Dispobinilidad = Dispobinilidad;
	 }// constructor por parametro

	 public Libro crearLibro() {
	    	
	    	Scanner scan = new Scanner(System.in).useDelimiter("\r\n");
	    	System.out.println("INGRESAR TITULO: ");
	    	Titulo = scan.next();
	    	System.out.println("INGRESAR AUTOR: ");
	    	Autor = scan.next();
	    	System.out.println("INGRESAR ISBN (numero identificador): ");
	    	ISBN = scan.nextInt();
	    	System.out.println("INGRESAR GENERO (narrativa n / poesia p / drama d) : ");
	    	Genero = scan.next();
	    	System.out.println("DISPOBINILIDAD ");
	    	Dispobinilidad = "s";
	    	System.out.println( Dispobinilidad);
	    	System.out.println("-----");
	    	Libro livro = new Libro(Titulo,Autor,ISBN,Genero,Dispobinilidad);
	    	
	    	return livro;
	    	
	    }
	 
	 public void infoLibro() {
		 String info =  "Titulo:" + Titulo + " "+
				 " Autor:"+ Autor + " "+
				 " ISBN:" + ISBN + " "+
				 "Genero:"+ Genero+ " "+
				 "Disponibilidad:"+ Dispobinilidad;
		System.out.print(info);
	 }
 
}
