package proyecto.estacion.meteorologica.model;

import java.util.Date;

import lombok.Data;

// TODO: Auto-generated Javadoc
/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data
public class ChipDataBean {

	/** The chip id. */
	private String chipId;
    
    /** The temperatura. */
    private String temperatura;
    
    /** The humedad. */
    private String humedad;
    
    /** The hic. */
    private String hic;
    
    /** The fecha grabado. */
    private Date fechaGrabado;
 
    /**
     * Instantiates a new chip data bean.
     *
     * @param chipId the chip id
     * @param temperatura the temperatura
     * @param humedad the humedad
     * @param hic the hic
     * @param fechaGrabado the fecha grabado
     */
    public ChipDataBean(String chipId, String temperatura, String humedad, String hic, Date fechaGrabado) {
        super();
        this.chipId = chipId;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.hic = hic;
        this.fechaGrabado = fechaGrabado;
    }
    
    /**
     * Instantiates a new chip data bean.
     */
    public ChipDataBean() {
        super();
    }
}
