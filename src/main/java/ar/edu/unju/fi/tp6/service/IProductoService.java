/**
 * 
 */
package ar.edu.unju.fi.tp6.service;

import java.util.List;

import ar.edu.unju.fi.tp6.entity.Producto;

/**
 * @author Team Fernet
 *
 */
public interface IProductoService {

	public void guardar(Producto producto);

	public Producto obtenerUltimo();

	public List<Producto> obtenerProductos();

	public Producto buscarProducto(int posicion);
	
}
