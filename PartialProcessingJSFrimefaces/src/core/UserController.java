package core;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="userController")
@RequestScoped

public class UserController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User loginUser;
	/**
	 * @param loginUser
	 */
	public UserController(User loginUser) {
		super();
		this.loginUser = loginUser;
	}
	/**
	 * 
	 */
	public UserController() {
		super();
		this.loginUser = new User();
	}
	/**
	 * @return the loginUser
	 */
	public User getLoginUser() {
		return loginUser;
	}
	/**
	 * @param loginUser the loginUser to set
	 */
	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
	
	/*
	 * 
	 * 
	 */
	public String updateUser() {
		System.out.println("Updating User ID : "+ this.loginUser.getId());
		String msg = "User updated Successfully";
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
		
		return "userDetails";
	}
	
	public String deleteUser() {
		System.out.println("Deleting User ID : "+ this.loginUser.getId());
		String msg = "User deleted Successfully";
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO,msg,msg));
		
		return "userDetails.jsf";
	}
}
