/**
 * 
 */
package ar.edu.unju.fi.tp6.service;

import java.util.List;

import ar.edu.unju.fi.tp6.entity.Cliente;

/**
 * @author Team Fernet
 *
 */
public interface IClienteService {

	public void generarLista();

	public void guardar(Cliente cliente);

	public List<Cliente> obtenerLista();
}
