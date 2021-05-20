/**
 * 
 */
package ar.edu.unju.fi.tp6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Team Fernet
 *
 */

@Component
@Entity
@Table(name="productos")
public class Producto {

	// Atributos de clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="prod_nombre", nullable = false)
	private String nombre;
	
	@Column(name="prod_precio", nullable = false)
	private double precio;
	
	@Column(name="prod_marca", nullable = false)
	private String marca;
	
	@Column(name="prod_descripcion", nullable = false)
	private String descripcion;
	
	@Column(name="prod_image", nullable = false)
	private String image;
	
	@Column(name="prod_stock", nullable = false)
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
