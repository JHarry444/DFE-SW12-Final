package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		final String url = "jdbc:mysql://localhost:3306/dfe_sw12";
		final String user = "root";
		final String password = "pass";
		final String SELECT = "SELECT * from `game`;";

		// try-with-resources (auto-closes anything in the () )
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();) {
			ResultSet results = stmt.executeQuery(SELECT);

			while (results.next()) {
				Integer id = results.getInt(1); // col indexes start at 1
				String name = results.getString(2);
				String pub = results.getString(3);
				String plat = results.getString(4);
				System.out.println("ID: " + id + " Name: " + name + " Pub: " + pub + " Plat: " + plat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		final String name = "Pokemon Arceus";
		final String INSERT = "INSERT INTO `game` (`name`, `publisher`, `platform`) VALUES (?, ?, ?);";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(INSERT);) {
			stmt.setString(1, name);
			stmt.setString(2, "Nintendo");
			stmt.setString(3, "Switch");

			stmt.executeUpdate(INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		final int id = 2;
		final String DELETE = "DELETE FROM `game` WHERE `id` = ?;";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(DELETE)) {
			stmt.setInt(1, id);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
