package proyecto.estacion.meteorologica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import proyecto.estacion.meteorologica.model.DataInfoEntity;

@Repository
public interface IDataRepository extends JpaRepository<DataInfoEntity, Integer>  {

	@Query(value = "SELECT * FROM ESTA_METEO_DATA t WHERE t.chip_Id = ?1", nativeQuery = true)
    List<DataInfoEntity> findByChipId(String chipId);
}