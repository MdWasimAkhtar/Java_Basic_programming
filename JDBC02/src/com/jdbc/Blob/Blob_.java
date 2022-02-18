package com.jdbc.Blob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Blob_ {
	
public static void  stored_blob(){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","My@Sql1234");
			
			Statement stmt = conn.createStatement();
			String sqlQuery = "Create Table if not exists BlobStored (Image_id int(10) primary key , userName varchar(50) not null , image LONGBLOB) ";
			stmt.execute(sqlQuery);
			
			System.out.println("connection Established "+conn);
			
			String pst_query = "insert into BlobStored values(?,?,?)";
			
			PreparedStatement pst = conn.prepareStatement(pst_query);
			
			pst.setInt(1, 10001);
			pst.setString(2, "Shilpa");
			
			File file = new File("/home/ubuntu-wasim/woman01.jpeg");
			FileInputStream fis = new FileInputStream(file);
			
			
			pst.setBinaryStream(3, fis);
			
			int res = pst.executeUpdate();
			
//			conn.commit();  Can't call commit when autocommit=true
			
			conn.close();
		}
		catch(ClassNotFoundException |FileNotFoundException| SQLException e ) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		stored_blob();
	}

}
