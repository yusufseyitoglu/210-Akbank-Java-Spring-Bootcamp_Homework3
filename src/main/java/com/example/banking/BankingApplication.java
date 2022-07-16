package com.example.banking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(0);
		account.setEmail("yusuf@seyitoglu.com");
		account.setName("Yusuf");
		account.setNumber(1234567890);
		account.setType("Tl");
		account.setTc("24178654575");
		/*
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Yusa\\Desktop\\" + account.getNumber())));
			writer.write(account.toFileFormat());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
