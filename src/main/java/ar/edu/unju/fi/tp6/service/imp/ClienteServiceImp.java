/**
 * 
 */
package ar.edu.unju.fi.tp6.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.entity.Cliente;
import ar.edu.unju.fi.tp6.service.IClienteService;
import ar.edu.unju.fi.tp6.util.ListaClientes;

/**
 * @author Team Fernet
 *
 */
@Service("clienteServiceImp")
public class ClienteServiceImp implements IClienteService {

	// Constante LOGGER para realizar las trazas de la aplicación
	private static final Log LOGGER = LogFactory.getLog(ClienteServiceImp.class);

	// Atributo listaClientes de tipo ArrayList<Cliente>
	private List<Cliente> listaClientes = ListaClientes.listaClientes;

	@Override
	public void generarLista() {
		LOGGER.info("SERVICE: ClienteService");
		LOGGER.info("METHOD: generarLista()");
		// Por defecto se agregan un objeto de tipo Cliente
		listaClientes.add(new Cliente("Pasaporte", 37000000, "Humilde Alumno", "humildealumno@gmail.com", "humilde",
				LocalDate.of(1999, 2, 26), 388, 1200039, LocalDate.of(2020, 1, 16)));
		LOGGER.info("RESULT: Lista tamaño: " + listaClientes.size());
	}

	@Override
	public void guardar(Cliente cliente) {
		LOGGER.info("SERVICE: ClienteService");
		LOGGER.info("METHOD: guardar() -> Lista tamaño: " + listaClientes.size());
		listaClientes.add(cliente);
		LOGGER.info("RESULT: -> Lista tamaño: " + listaClientes.size());
	}

	@Override
	public List<Cliente> obtenerLista() {
		LOGGER.info("SERVICE: ClienteService");
		/**
		 * Para la demostración se agregó un registro por defecto a la lista
		 */
		if (listaClientes.size() == 0) {
			generarLista();
		}
		LOGGER.info("METHOD: obtenerLista()");
		LOGGER.info("RESULT: Lista tamaño: " + listaClientes.size());
		return listaClientes;
	}

}
