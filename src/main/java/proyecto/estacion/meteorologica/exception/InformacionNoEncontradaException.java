package proyecto.estacion.meteorologica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class InformacionNoEncontradaException.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InformacionNoEncontradaException  extends RuntimeException{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9025870371975524935L;
	
	/** The exception detail. */
	private String exceptionDetail;
    
    /** The campo error. */
    private Object campoError;

    /**
     * Instantiates a new informacion no encontrada exception.
     *
     * @param exceptionDetail the exception detail
     * @param campoError the campo error
     */
    public InformacionNoEncontradaException( String exceptionDetail, String campoError) {
        super(exceptionDetail+" - "+campoError);
        this.exceptionDetail = exceptionDetail;
        this.campoError = campoError;
    }

    /**
     * Gets the exception detail.
     *
     * @return the exception detail
     */
    public String getExceptionDetail() {
        return exceptionDetail;
    }

    /**
     * Gets the campo error.
     *
     * @return the campo error
     */
    public Object getCampoError() {
        return campoError;
    }

}
