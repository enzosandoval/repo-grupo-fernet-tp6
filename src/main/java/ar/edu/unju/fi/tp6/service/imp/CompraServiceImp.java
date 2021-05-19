package ar.edu.unju.fi.tp6.service.imp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.entity.Compra;
import ar.edu.unju.fi.tp6.service.ICompraService;
import ar.edu.unju.fi.tp6.util.ListaCompras;

/**
 * @author Team Fernet
 *
 */

@Service
public class CompraServiceImp implements ICompraService {

	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);

	private List<Compra> listaCompras = ListaCompras.listaCompras;

	private static int id = 0;

	@Override
	public void guardarCompra(Compra compra) {
		compra.setId(id);
		listaCompras.add(compra);
		id++;
		LOGGER.info("METHOD: guardarCompra - Se agrego un objeto compra en la lista");
		LOGGER.info("RESULT: Compra agregada con éxito -> Tamaño lista: " + listaCompras.size());
	}

	@Override
	public Compra obtenerUltimaCompra() {
		LOGGER.info("METHOD: obtenerUltimaCompra()");
		Compra compra = null;
		if (!listaCompras.isEmpty()) {
			LOGGER.info(
					"RESULT: Ultima compra: " + listaCompras.get(listaCompras.size() - 1).getProducto().getNombre());
			compra = listaCompras.get(listaCompras.size() - 1);

		}
		return compra;
	}

	@Override
	public List<Compra> obtenerCompras() {
		LOGGER.info("METHOD: obtenerCompras()");
		return listaCompras;
	}

}
