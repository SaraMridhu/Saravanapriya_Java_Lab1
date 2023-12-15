package com.gl.javafsd.emailapp.service;

import com.gl.javafsd.emailapp.model.Employee;

public interface ICredentialService {

	public String generateEmailAddress(String firstName, String lastName,int deptCode);
	public String generatePassword();
	public void showCredentials(Employee emp);
}
