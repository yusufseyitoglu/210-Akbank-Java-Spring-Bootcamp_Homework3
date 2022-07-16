package com.example.banking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.tomcat.jni.OS;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	/* Test Account Number */
	@SuppressWarnings("unused")
	@PatchMapping("/accounts/{accountNumber}")
	public void deposit(@PathVariable String accountNumber, @RequestBody AccountBalanceUpdateRequest request) {
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Yusa\\Desktop\\bootc" + accountNumber)));
		
			try {
				Account c = (Account)is.readObject();
				c.setBalance(c.getBalance() + request.getBalance());
				ObjectInputStream os = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Yusa\\Desktop\\bootc" + accountNumber)));
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
