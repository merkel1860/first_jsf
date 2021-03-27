package core;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class LoginBean
 */
@Stateless(mappedName = "loginBean")
@LocalBean
public class LoginBean {
	
	private String name;
	private String password;
	
	
    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
     * Default constructor. 
     */
    public LoginBean() {
        // TODO Auto-generated constructor stub
    }

}
