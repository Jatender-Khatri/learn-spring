package com.test;

public class Student {
	private String name, rollNumber, password, email;
	private Double fees;
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
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the fees
	 */
	public Double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(Double fees) {
		this.fees = fees;
	}
	
	public void display()
	{
		System.out.println("Hi I am Jatender Khatri");
	}
	public void run()
	{
		System.out.println("Mehran Univeristy");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", password=" + password + ", email=" + email
				+ ", fees=" + fees + "]";
	}
	
}
