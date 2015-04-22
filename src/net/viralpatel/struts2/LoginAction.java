package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	/**
	 * This method authenticates the user.
	 * This simple app checks to make sure the username is
	 * admin and the password is admin123.
	 * @return	Returns the string indicating 
	 * authentication success or failure.
	 */
	public String execute()
	{
		if (this.username.equals("admin") && this.password.equals("admin123"))
		{
			return "success";
		}else{
			addActionError(getText("error.login"));
			return "error";
		}
	}
	
	/**
	 * Retrieves the value stored in username.
	 * 
	 * @return	Returns the value of the private variable username.
	 */
	public String getUsername()
	{
		return username;
	}
	
	/**
	 * Sets the value of the the private variable username.
	 * @param username	The new value used to set the current username.
	 */
	public void setUsername( String username )
	{
		this.username = username;
	}
	
	/**
	 * Retrieves the value stored in password.
	 * 
	 * @return	Returns the value of the private variable password.
	 */
	public String getPassword()
	{
		return password;
	}
	
	/**
	 * Sets the value of the the private variable password.
	 * @param password	The new value used to set the current password.
	 */
	public void setPassword( String password )
	{
		this.password = password;
	}
}
