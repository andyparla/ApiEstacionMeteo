package proyecto.estacion.meteorologica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import proyecto.estacion.meteorologica.entity.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface IDataRepository.
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long>  {
	
	public User findByUserName(String userName);
	
}
