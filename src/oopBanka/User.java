package oopBanka;

public class User {
	
	private String name;
	private String surName;
	private String email;
	private Acount account;
	
	
	
	
	public User() {
		
	}
	public User(String name, String surName,  Acount account) {
		super();
		this.name = name;
		this.surName = surName;
		//this.email=email;
		this.account = account;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	public String getEmail() {
		return email;
		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}

	public Acount getAccount() {
		return account;
	}
	public void setAccount(Acount account) {
		this.account = account;
	}
	

}
