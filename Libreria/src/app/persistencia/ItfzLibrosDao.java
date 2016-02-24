/**
 * 
 */
package app.persistencia;

import java.util.List;

import app.modelo.Autor;
import app.modelo.Editorial;
import app.modelo.Libro;

/**
 * @author LuisJArellano
 * @version 20150319
 * 
 * Interface del DAO para ejecución desde negocio.
 */
public interface ItfzLibrosDao {

	/** Crea un nuevo registro en la tabla con los datos del libro recibido como argumento
	  * @param libro el objeto a insertar
	  * @return true si el alta se ha realizado, false caso contrario
	  * @throws Excepcion
	  */
	public void altaLibro(Libro libro);
	
	/** Crea un nuevo registro en la tabla con los datos del autor recibido como argumento
	  * @param libro el objeto a insertar
	  * @return true si el alta se ha realizado, false caso contrario
	  * @throws Excepcion
	  */
	public void altaAutor(Autor autor);
	
	/** Crea un nuevo registro en la tabla con los datos de la editorial recibida como argumento
	  * @param libro el objeto a insertar
	  * @return true si el alta se ha realizado, false caso contrario
	  * @throws Excepcion
	  */
	public void altaEditorial(Editorial editorial);
	
	/** Consulta todos los registros de la tabla Libro
	  * @return List de Libro
	  * @throws LibroNoEncontradoException
	  */
	public List<Libro> consultarTodos();
	
	/** Consulta el registro indicado de la tabla Libro
	  * @return isbn de registro a consultar
	  * @throws LibroNoEncontradoException
	  */
	public Libro consultarISBN(String isbn);
	
	/** Consulta el registro indicado de la tabla Libro
	  * @return titulo de registro a consultar
	  * @throws LibroNoEncontradoException
	  */
	public List<Libro> consultarTitulo(String titulo);
	
	/** Modifica precio del registro indicado en la tabla libro
	  * @param isbn del registro a eliminar, precio que se modifica
	  * @return true si se ha modificado correctamente, false caso contrario
	  */
	public boolean modificarPrecio(String isbn, double precio);

	/** Elimina el registro indicado en la tabla libro
	  * @param isbn del registro a eliminar
	  * @return true si se ha elimando correctamente, false caso contrario
	  */
	public boolean eliminarLibro(String ISBN);
	
}
