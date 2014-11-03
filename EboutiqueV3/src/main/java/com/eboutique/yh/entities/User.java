package com.eboutique.yh.entities;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable{

	private Long iduser;
	private String userName;
	private String password;
	private boolean actived;
	private Collection<Role>roles;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public User(String userName, String password, boolean actived) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}





	public Long getIduser() {
		return iduser;
	}


	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActived() {
		return actived;
	}


	public void setActived(boolean actived) {
		this.actived = actived;
	}


	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	
	
	
	
	
	
}
