package com.projetos.estoque;

import java.sql.DriverManager;
import java.sql.Connection;

public class BancoPostgres {
	public static void main(String[] args) {
		Connection connection=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			if(connection !=null) {
				System.out.println("connetion ok");
			}else {
				System.out.println("connetion nok");
			}
			
		} catch(Exception e) {
			System.out.println("Connection Failed");
		}
	}
}
