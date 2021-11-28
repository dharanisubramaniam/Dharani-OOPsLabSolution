package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.schema.Employee;

public class Service {
	public String email;
	public char[] password;
	
	public String generateEmail(String firstName,String lastName,String department) {
		email = firstName+lastName+"@"+department+".abc.com";
		return email;
	}
	public char[] generatePassword() {
	    String values = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"+"jklmnopqrstuvwxyz!@#$%&";
        // Using random method
        Random rndm_method = new Random();
        char[] password = new char[8];
        for (int i = 0; i < 8; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
	}
	public void showCredentials(String email,char[] password) {
		System.out.println("Your emailaddress is "+email);
		System.out.println("Your password is "+password);
	}

}
