package proyecto.estacion.meteorologica.service;

import java.util.List;

import proyecto.estacion.meteorologica.exception.InformacionNoEncontradaException;
import proyecto.estacion.meteorologica.model.ChipDataBean;

public interface IDataInfoService {

	public List<ChipDataBean> getInfoByChip(String chipId);
	
	public ChipDataBean crearActualizarData(ChipDataBean infoData) throws InformacionNoEncontradaException;
	
	public void borrarData(String chipId) throws InformacionNoEncontradaException;
	
}
