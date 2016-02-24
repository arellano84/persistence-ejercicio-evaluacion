package app.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.modelo.Autor;
import app.modelo.Direccion;
import app.modelo.Editorial;
import app.modelo.Libro;
import app.negocio.ItfzGestionLibreria;

/**
 * @author LuisJArellano
 * @version 20150319
 * 
 * JAVOL14_3
 * Módulo 3 JPA, Hibernate y MongoDB. Ejercicio evaluación.
 */
public class Main{

	private static ApplicationContext contenedor;
	
	public static void main(String[] args){
		
		//Generando el contenedor de beans
		contenedor = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("******************************LIBRERIA HIBERNATE*****************************************");
		
		//Obtiene el bean gestionLibreria del nucleo. Se accederá a través de la interface.
		ItfzGestionLibreria igestionlibreria = (ItfzGestionLibreria) contenedor.getBean("gestionLibreria");
		
		//Insertando datos
		
		System.out.println("\n____________________________Alta Libros_________________________________________");
		try{
			 Autor autor = new Autor("Gary Jennyngs", "Inglaterra", "Sin comentarios...");
			 Libro libro = new Libro("Azteca","0001",2007,11,"Novela Histórica");
			 libro.addAutor(autor);
			 Editorial editorial= new Editorial("Planeta", "000000001",new Direccion("Barceloneta",1,"Barceloneta",1000,"Barcelona"));
			 editorial.addLibro(libro);
			 
			 Autor autor2 = new Autor("Gaby Vargas", "México", "Sin comentarios...");
			 Libro libro2 = new Libro("El arte de convivir","0002",2002,10,"Tema social");
			 libro2.addAutor(autor2);
			 Editorial editorial2= new Editorial("Planeta Mexico", "000000001",new Direccion("Insurgentes",1,"Florica",2000,"DF"));
			 editorial2.addLibro(libro2);
			 
			 Autor autor3 = new Autor("Antony Beevor", "Inglaterra", "Sin comentarios...");
			 Libro libro3 = new Libro("La segunda guerra mundial","0003",2012,20,"Historia");
			 libro3.addAutor(autor3);
			 Editorial editorial3= new Editorial("Pasado y Presente", "000000001",new Direccion("Pau Claris",1,"Pau Claris",3000,"Barcelona"));
			 editorial3.addLibro(libro3);
			 
			 //Insertando objetos
			 igestionlibreria.altaEditorial(editorial);
			 igestionlibreria.altaEditorial(editorial2);
			 igestionlibreria.altaEditorial(editorial3);
			 
		}catch(Exception e){}
		
		
		//Gestionando Datos
		
		System.out.println("\n____________________________Consultar Todos____________________________________");
		igestionlibreria.consultarTodos();
		
		System.out.println("\n____________________________Consultar X ISBN___________________________________");
		igestionlibreria.consultarISBN("0001");
		
		System.out.println("\n____________________________Consultar X Titulo_________________________________");
		igestionlibreria.consultarTitulo("guerra");
		
		System.out.println("\n____________________________Modificar Precio___________________________________");
		igestionlibreria.modificarPrecio("0003", 22);
		
		System.out.println("\n____________________________Eliminar Libro_____________________________________");
		igestionlibreria.eliminarLibro("0002");
		
		System.out.println("\n____________________________Consultar Todos____________________________________");
		igestionlibreria.consultarTodos();
		
	}

}
