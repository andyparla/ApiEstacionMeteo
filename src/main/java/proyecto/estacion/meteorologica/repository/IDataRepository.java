package proyecto.estacion.meteorologica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import proyecto.estacion.meteorologica.entity.DataInfoEntity;

// TODO: Auto-generated Javadoc
/**
 * The Interface IDataRepository.
 */
@Repository
@Transactional
public interface IDataRepository extends JpaRepository<DataInfoEntity, Long>  {

	/**
	 * Find by chip id.
	 *
	 * @param chipId the chip id
	 * @return the list
	 */
	@Query(value = "SELECT * FROM ESTA_METEO_DATA t WHERE t.chip_Id = ?", nativeQuery = true)
    List<DataInfoEntity> findByChipId(String chipId);
	
	/**
	 * Delete by chip id.
	 *
	 * @param chipId the chip id
	 */
	void deleteByChipId(String chipId);
}
