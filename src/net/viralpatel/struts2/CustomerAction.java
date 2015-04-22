package net.viralpatel.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	private String name;
	private Integer age;
	private String email;
	private String telephone;
	
	/**
	 * 
	 * @return
	 */
	public String addCustomer()
	{
		return "success";
	}
	
	/**
	 * Returns the name of the Customer
	 * @return	Returns a string type describing the name of the Customer
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the Customer's name field.
	 * @param name	The new parameter to set the Customer's name field with.
	 */
	public void setName( String name )
	{
		this.name = name;
	}
	
	/**
	 * Returns the age of the Customer.
	 * @return	Returns an Integer type with the age of the Customer.
	 */
	public Integer getAge()
	{
		return age;
	}
	
	/**
	 * Sets the Customer's age field.
	 * @param age	The new parameter to set the Customer's age field with.
	 */
	public void setAge( Integer age )
	{
		this.age = age;
	}
	
	/**
	 * Returns the email of the Customer.
	 * @return	Returns a String type with the email of the Customer.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Sets the Customer's email field.
	 * @param email	The new parameter to set the Customer's email
	 */
	public void setEmail( String email )
	{
		this.email = email;
	}
	
	/**
	 * Returns the telephone number of the Customer.
	 * @return	Returns a String type with the telephone number of the Customer.
	 */
	public String getTelephone()
	{
		return telephone;
	}
	
	/**
	 * Sets the Customer's telephone field.
	 * @param telephoneThe new parameter to set the Customer's telephone number with.
	 */
	public void setTelephone( String telephone )
	{
		this.telephone = telephone;
	}
	
}
