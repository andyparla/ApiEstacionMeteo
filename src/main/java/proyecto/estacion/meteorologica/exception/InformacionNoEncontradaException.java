package proyecto.estacion.meteorologica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InformacionNoEncontradaException  extends RuntimeException{


	private static final long serialVersionUID = -9025870371975524935L;
	
	private String exceptionDetail;
    private Object campoError;

    public InformacionNoEncontradaException( String exceptionDetail, String campoError) {
        super(exceptionDetail+" - "+campoError);
        this.exceptionDetail = exceptionDetail;
        this.campoError = campoError;
    }

    public String getExceptionDetail() {
        return exceptionDetail;
    }

    public Object getCampoError() {
        return campoError;
    }

}
