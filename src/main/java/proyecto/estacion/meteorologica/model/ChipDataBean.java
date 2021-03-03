package proyecto.estacion.meteorologica.model;

import java.util.Date;

import lombok.Data;

@Data
public class ChipDataBean {

	private String chipId;
    private String temperatura;
    private String humedad;
    private String hic;
    private Date fechaGrabado;
 
    public ChipDataBean(String chipId, String temperatura, String humedad, String hic, Date fechaGrabado) {
        super();
        this.chipId = chipId;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.hic = hic;
        this.fechaGrabado = fechaGrabado;
    }
    
    public ChipDataBean() {
        super();
    }
}
