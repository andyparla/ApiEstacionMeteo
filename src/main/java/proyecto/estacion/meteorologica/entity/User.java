package proyecto.estacion.meteorologica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "User")
@Table(name = "user")
@Data
public class User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5040098181917549184L;
	public User() {}
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "username")
    private String userName;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
}
