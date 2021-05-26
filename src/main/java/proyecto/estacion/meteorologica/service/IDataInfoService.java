package proyecto.estacion.meteorologica.service;

import java.util.List;

import proyecto.estacion.meteorologica.exception.InformacionNoEncontradaException;
import proyecto.estacion.meteorologica.model.ChipDataBean;

// TODO: Auto-generated Javadoc
/**
 * The Interface IDataInfoService.
 */
public interface IDataInfoService {

	/**
	 * Gets the info by chip.
	 *
	 * @param chipId the chip id
	 * @return the info by chip
	 */
	public List<ChipDataBean> getInfoByChip(String chipId);
	
	/**
	 * Crear actualizar data.
	 *
	 * @param infoData the info data
	 * @return the chip data bean
	 * @throws InformacionNoEncontradaException the informacion no encontrada exception
	 */
	public ChipDataBean crearActualizarData(ChipDataBean infoData) throws InformacionNoEncontradaException;
	
	/**
	 * Borrar data.
	 *
	 * @param chipId the chip id
	 * @throws InformacionNoEncontradaException the informacion no encontrada exception
	 */
	public void borrarData(String chipId) throws InformacionNoEncontradaException;
	
}
