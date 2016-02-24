# persistence-ejercicio-evaluacion
# Ejercicio de Evaluación para Hibernate

El siguiente ejercicio será el determinante para la evaluación del modulo.
Se puntuará teniendo en cuenta los siguientes aspectos:
	Evidentemente el programa debe funcionar
	Se debe ceñir a los requisitos establecidos
	El código debe ser ordenado y tabulado para facilitar la lectura
	Se deben adjuntar comentarios en el código. Explicando el uso de variables y algoritmos utilizados.

ENUNCIADO EJERCICIO EVALUACION

Continuando en el proyecto anterior , se pide realizar las siguientes tareas:
1.- En el paquete app.modelo crear la clase encapsulada Autor con las siguientes propiedades:
	String nombre
	String nacionalidad
	String comentarios

2.- En el paquete app.modelo crear la clase encapsulada Direccion con las siguientes propiedades:
	String calle
	int numero
	String poblacion
	int cp
	String provincia

3.- En el paquete app.modelo crear la clase encapsulada Editorial con las siguientes propiedades:
	String nombre
	Direccion direccion
	String nif

4.- Dibujar el modelo de dominio entre las tres entidades Autor, Libros y Editorial. Teniendo en cuenta lo siguiente:
	Un libro puede pertenecer a uno o varios autores
	Un autor puede tener uno o varios libros
	Un libro pertenece a una sola Editorial
	Una editorial puede tener uno o varios libros

5.- Crear un paquete app.mapeos donde crearemos los archivos de mapeo de Hibernate de todas las entidades relacionadas entre si.

6.- Crear una clase principal para forzar la creación de las tablas, utilizar la misma base de datos LIBRERIA. Los nombres de las tablas serán: LIBROS, AUTORES y EDITORIALES.

7.- Adaptar la clase LibrosDAO para realizar todas las operaciones utilizando Hibernate y el lenguaje de consultas HQL.

8.- Si alguno de vosotros preferis utilizar JPA en lugar de Hibernate también podeis hacerlo.

