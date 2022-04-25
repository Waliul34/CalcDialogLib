package com.maltaisn.calcdialoglib.demo;

public class Account {
    public String email;

    public Account(){}

    public Account(String email) 
    {
        this.email = email;
    }
	
    public String getEmail()
    {
	return email;
    }
	
    public void setEmail(String newEmail)
    {
	this.email = newEmail;
    }
}
