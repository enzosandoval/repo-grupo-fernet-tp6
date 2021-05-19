/**
 * 
 */
package ar.edu.unju.fi.tp6.entity;

import org.springframework.stereotype.Component;

/**
 * @author Team Fernet
 *
 */

@Component
public class Producto {

	// Atributos de clase
	private int codigo;
	private String nombre;
	private double precio;
	private String marca;
	private String descripcion;
	private String image;
	private int stock;

	// Constructor por defecto
	public Producto() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param marca
	 * @param descripcion
	 * @param image
	 * @param stock
	 */
	public Producto(int codigo, String nombre, double precio, String marca, String descripcion, String image,
			int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.descripcion = descripcion;
		this.image = image;
		this.stock = stock;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca
				+ ", descripcion=" + descripcion + ", image=" + image + ", stock=" + stock + "]";
	}

}
