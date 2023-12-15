package com.gl.javafsd.emailapp.service;

import com.gl.javafsd.emailapp.model.Employee;
import com.gl.javafsd.emailapp.util.EmailAppUtil;

public class CredentialServiceImpl implements ICredentialService{
	public String generateEmailAddress(String firstName, String lastName,int deptCode){
	String deptName = EmailAppUtil.getDepartmentName(deptCode);
	String emailAddress = firstName+lastName+"@"+deptName +".abc.com";
	return emailAddress;
	
	}
	public String generatePassword(){
		PasswordGenerator passwordGenerator = new PasswordGenerator();		
		String password = passwordGenerator.generate();		
		return password;	
	}
	public void showCredentials(Employee emp){
	System.out.println("Dear "+ emp.getFirstName()+", your generated credentials are as follows");
	System.out.println("Email    ---> "+ emp.getEmail());
	System.out.println("Password ---> "+ emp.getPassword());
	}

}
