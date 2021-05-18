package proyecto.estacion.meteorologica.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import proyecto.estacion.meteorologica.entity.DataInfoEntity;
import proyecto.estacion.meteorologica.exception.InformacionNoEncontradaException;
import proyecto.estacion.meteorologica.model.ChipDataBean;
import proyecto.estacion.meteorologica.repository.IDataRepository;
import proyecto.estacion.meteorologica.service.IDataInfoService;

@Service
public class DataInfoService implements IDataInfoService{
     
    @Autowired
    private IDataRepository repository;
     
    public List<ChipDataBean> getInfoByChip(String chipId)
    {
    	List<DataInfoEntity> infoList = repository.findByChipId(chipId);
         
        if(!CollectionUtils.isEmpty(infoList)) 
        {
        	List<ChipDataBean> lstInfoData = new ArrayList<ChipDataBean>();
        	for(DataInfoEntity entity : infoList) 
        	{
        		ChipDataBean data = new ChipDataBean();
        		data.setChipId(entity.getChipId());
        		data.setHumedad(entity.getHumedad());
        		data.setHic(entity.getHic());
        		data.setTemperatura(entity.getTemperatura());
        		data.setFechaGrabado(entity.getFechaGrabado());
        		lstInfoData.add(data);
        	}
        	return lstInfoData;
        } else {
            return new ArrayList<ChipDataBean>();
        }
    }
     
    public ChipDataBean crearActualizarData(ChipDataBean infoData) throws InformacionNoEncontradaException
    {
    	
    	DataInfoEntity newEntity = new DataInfoEntity();
    	newEntity.setId(null);
    	newEntity.setChipId(infoData.getChipId());
		newEntity.setHumedad(infoData.getHumedad());
        newEntity.setTemperatura(infoData.getTemperatura());
        newEntity.setHic(infoData.getHic());
        newEntity.setFechaGrabado(new Date());
        newEntity = repository.save(newEntity);
         
        return infoData;   
    }
     
    public void borrarData(String chipId) throws InformacionNoEncontradaException
    {
    	List<DataInfoEntity>  data = repository.findByChipId(chipId);
         
        if(!CollectionUtils.isEmpty(data))
        {
            repository.deleteByChipId(chipId);
        } else {
            throw new InformacionNoEncontradaException("No student record exist for given id", chipId);
        }
    }
}