package proyecto.estacion.meteorologica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import proyecto.estacion.meteorologica.model.ChipDataBean;
import proyecto.estacion.meteorologica.service.IDataInfoService;

@RestController
@RequestMapping("/estacion")
public class EstacionRestController {
	
	@Autowired
	IDataInfoService dataService;
	
	@ApiOperation(value = "Obtiene la información almacenada por chip", 
			response = ChipDataBean.class, tags = "DataInfo")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "No autorizado"), 
            @ApiResponse(code = 404, message = "página no encontrada") })
    @GetMapping(value = "/data/{chipId}")
	 public List<ChipDataBean> getDataInfo(@PathVariable(value = "chipId") String chipId) {
		return dataService.getInfoByChip(chipId);
	 }
	
	@ApiOperation(value = "Almacena la información obtenida por chip", tags = "DataInfo")
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "Creado"),
            @ApiResponse(code = 401, message = "No autorizado"), 
            @ApiResponse(code = 404, message = "página no encontrada") })
    @PostMapping(value = "/data", consumes = "application/json", produces = "application/json")
	 public void postDataInfo(@RequestBody ChipDataBean chipData) {
		dataService.crearActualizarData(chipData);
	}
} 