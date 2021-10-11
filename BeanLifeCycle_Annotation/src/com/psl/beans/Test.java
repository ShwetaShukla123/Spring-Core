package com.psl.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Test
{

	private String driver, url, username, password;
	Connection con ;
	
	//similar to init method
	@PostConstruct
	public void connInit() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection opened");
	}
	
	public void save(int id, String name, String email, String address) {
		try {
			System.out.println(con);
			PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?, ?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, address);
			
			ps.execute();
			System.out.println("Insertion successful");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	//similar to destroy method
	@PreDestroy
	public void connDestroy() throws Exception {
		con.close();
		System.out.println("Connection closed");
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
