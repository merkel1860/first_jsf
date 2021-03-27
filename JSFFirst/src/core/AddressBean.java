package core;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "address")
@SessionScoped


public class AddressBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private String addressComplete;
	/**
	 * @return the addressComplete
	 */
	public String getAddressComplete() {
		return addressComplete;
	}
	/**
	 * @param addressComplete the addressComplete to set
	 */
	public void setAddressComplete(String addressComplete) {
		this.addressComplete = addressComplete;
	}
	/**
	 * 
	 */
	public AddressBean() {
		super();
	}
 
	
	
}
