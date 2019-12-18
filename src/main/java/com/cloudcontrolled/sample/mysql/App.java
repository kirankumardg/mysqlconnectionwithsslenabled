package com.cloudcontrolled.sample.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.net.ssl.SSLContext;

public class App {

	public static void main(String[] args) throws Exception {
		System.out.println("hello comint to main atleast");

		try {
			Class.forName("com.mysql.jdbc.Driver");			
			SSLContext sc = SSLContext.getInstance("TLSv1");
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from COMPANY_ROLES limit 2");
			System.out.println(rs.getFetchSize());
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected static Connection getConnection() throws SQLException {
		String host = "roleservice-accessdb-prd-clus.cluster-c9pfxhs9kqbq.us-west-2.rds.amazonaws.com";
		String port = "3306";
		String database = "roleManagementDB ";
		String username = "metadata_user";
		String password = "<password>";
		String dbUrl = "jdbc:mysql://" + host + ":" + port + "/" + database	+"?verifyServerCertificate=true&useSSL=true&requireSSL=true&enabledTLSProtocols=TLSv1.2";
		return DriverManager.getConnection(dbUrl, username, password);
	}
}
