package proyecto.estacion.meteorologica.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

// TODO: Auto-generated Javadoc
/**
 * The Class DataInfoEntity.
 */

/**
 * Instantiates a new data info entity.
 */
@Data
@Entity
@Table(name = "ESTA_METEO_DATA" )
public class DataInfoEntity {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY , generator="course")
	@Column(name = "ID")
	private Long id;

    /** The chip id. */
    @Column(name = "CHIP_ID")
	private String chipId;
	
    /** The temperatura. */
    @Column(name = "TEMPERATURA")
	private String temperatura;

	/** The humedad. */
	@Column(name = "HUMEDAD")
	private String humedad;

	/** The hic. */
	@Column(name = "HIC")
	private String hic;
	
	/** The fecha grabado. */
	@Column(name = "FEC_GRABADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaGrabado;
}
