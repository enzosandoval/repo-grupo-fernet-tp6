/**
 * 
 */
package ar.edu.unju.fi.tp6.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tp6.entity.Compra;

/**
 * @author Team Fernet
 *
 */
@Repository
public interface CompraRepository extends CrudRepository<Compra, Long> {

}
