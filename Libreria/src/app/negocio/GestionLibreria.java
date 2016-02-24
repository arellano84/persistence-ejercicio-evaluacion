package app.negocio;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import app.modelo.Autor;
import app.modelo.Editorial;
import app.modelo.Libro;
import app.persistencia.ItfzLibrosDao;

/**
 * @author LuisJArellano
 * @version 20150319
 * 
 * Bean de ejecuci�n de negocio que tendra acceso desde la interface de negocio.
 */
//Declaraci�n del bean con anotaciones.
@Component(value = "gestionLibreria")
public class GestionLibreria implements ItfzGestionLibreria{//Implementando la interface ItfzGestionLibreria.
	
	//Inyectando objeto al bean con anotaciones.
	@Inject
	ItfzLibrosDao ilibrosdao;

	public void altaLibro(Libro libro) throws Exception{
		try{
			ilibrosdao.altaLibro(libro);
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("isbn="+libro.getIsbn());
		}
	}
	
	public void altaAutor(Autor autor) throws Exception{
		try{
			ilibrosdao.altaAutor(autor);
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("autor="+autor.getNombre());
		}
	}
	
	public void altaEditorial(Editorial editorial) throws Exception{
		try{
			ilibrosdao.altaEditorial(editorial);
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("editorial="+editorial.getNombre());
		}
	}
	
	public void consultarTodos(){
		try{
			for (Libro libro: ilibrosdao.consultarTodos())
				System.out.println(libro);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void consultarISBN(String isbn) {
		try{
			System.out.println(ilibrosdao.consultarISBN(isbn));
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void consultarTitulo(String titulo){
		try{
			System.out.println(ilibrosdao.consultarTitulo(titulo));
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void modificarPrecio(String isbn, double precio){
		
		System.out.println(ilibrosdao.modificarPrecio(isbn,precio)?"Modificado":"No Modificado");
	}

	public void eliminarLibro(String isbn){
		
		System.out.println(ilibrosdao.eliminarLibro(isbn)?"Eliminado":"No Eliminado");
	}
	
	public ItfzLibrosDao getIlibrosdao() {
		return ilibrosdao;
	}

	public void setIlibrosdao(ItfzLibrosDao ilibrosdao) {
		this.ilibrosdao = ilibrosdao;
	}
	
}
