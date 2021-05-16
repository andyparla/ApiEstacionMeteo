package proyecto.estacion.meteorologica.model;

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

@Data
@Entity
@Table(name = "ESTA_METEO_DATA" )
public class DataInfoEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY , generator="course")
	@Column(name = "ID")
	private Long id;

    @Column(name = "CHIP_ID")
	private String chipId;
	
    @Column(name = "TEMPERATURA")
	private String temperatura;

	@Column(name = "HUMEDAD")
	private String humedad;

	@Column(name = "HIC")
	private String hic;
	
	@Column(name = "FEC_GRABADO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaGrabado;
}
