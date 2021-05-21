/**
 * 
 */
package ar.edu.unju.fi.tp6.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * It uses MySQL
 * 
 * @author Team Fernet
 *
 */
@Entity
@Component
@Table(name = "compras")
public class Compra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "com_id")
	private long id;

	/**
	 * Queda al aire este atributo
	 */
	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "total")
	private double total;

	@OneToOne
	@JoinColumn(name = "cli_id")
	private Cliente cliente;

	@OneToMany(mappedBy = "compra", fetch = FetchType.LAZY)
	private List<Producto> productos = new ArrayList<Producto>();

	public Compra() {
	}

	/**
	 * @param cantidad
	 * @param total
	 * @param cliente
	 */
	public Compra(int cantidad, double total, Cliente cliente) {
		this.cantidad = cantidad;
		this.total = total;
		this.cliente = cliente;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", cantidad=" + cantidad + ", total=" + total + ", cliente=" + cliente
				+ ", productos=" + productos + "]";
	}

}
