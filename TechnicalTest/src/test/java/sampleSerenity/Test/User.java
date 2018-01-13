package sampleSerenity.Test;


import net.java.amateras.xlsbeans.annotation.Column;

public class User {
	
	@Column(columnName="USERNAME")
	public String userName;
	
	@Column(columnName="USERPASSWORD")
	public String userPassword;
	
	@Column(columnName="USEREMAIL")
	public String userEmail;

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	/*public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}*/
	
	
	
}
