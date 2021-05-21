/**
 * 
 */
package ar.edu.unju.fi.tp6.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tp6.entity.Producto;

/**
 * @author Team Fernet
 *
 */
@Repository
public interface ProductoRepository extends CrudRepository <Producto, Long>{

	public Object findTopByOrderByCodigoDesc();
	
}
