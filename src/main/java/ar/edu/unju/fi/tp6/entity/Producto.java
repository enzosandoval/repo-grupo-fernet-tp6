/**
 * 
 */
package ar.edu.unju.fi.tp6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Team Fernet
 *
 */

@Entity
@Component
@Table(name = "PRODUCTOS")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_codigo")
	private int codigo;

	@Column(name = "prod_nombre", nullable = false)
	private String nombre;

	@Column(name = "prod_precio", nullable = false)
	private double precio;

	@Column(name = "prod_marca", nullable = false)
	private String marca;

	@Column(name = "prod_descripcion", nullable = false)
	private String descripcion;

	@Lob
	@Column(name = "prod_imagen", columnDefinition = "LONGBLOB")
	private String imagen;

	@Column(name = "prod_stock", nullable = false)
	private int stock;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "com_id")
	private Compra compra;

	// Constructor por defecto
	public Producto() {
	}

	/**
	 * @param nombre
	 * @param precio
	 * @param marca
	 * @param descripcion
	 * @param imagen
	 * @param stock
	 * @param compra
	 */
	public Producto(String nombre, double precio, String marca, String descripcion, String imagen, int stock,
			Compra compra) {
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.stock = stock;
		this.compra = compra;
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
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
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

	/**
	 * @return the compra
	 */
	public Compra getCompra() {
		return compra;
	}

	/**
	 * @param compra the compra to set
	 */
	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca
				+ ", descripcion=" + descripcion + ", imagen=" + imagen + ", stock=" + stock + ", compra=" + compra
				+ "]";
	}

}
