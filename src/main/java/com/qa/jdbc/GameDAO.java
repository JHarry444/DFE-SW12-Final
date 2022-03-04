package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {

	private final String url;
	private final String user;
	private final String password;

	public GameDAO(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public void createGame(String name, String publisher, String platform) {
		final String INSERT = "INSERT INTO `game` (`name`, `publisher`, `platform`) VALUES (?, ?, ?);";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(INSERT);) {
			stmt.setString(1, name);
			stmt.setString(2, publisher);
			stmt.setString(3, platform);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Game> readGames() {
		final String SELECT = "SELECT * from `game`;";
		List<Game> games = new ArrayList<>();
		// try-with-resources (auto-closes anything in the () )
		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();) {
			ResultSet results = stmt.executeQuery(SELECT);

			while (results.next()) { // iterates through each record
				Integer id = results.getInt(1); // col indexes start at 1
				String name = results.getString(2);
				String pub = results.getString(3);
				String plat = results.getString(4);

				games.add(new Game(id, name, pub, plat));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return games;
	}

	public void updateGame(String name, String publisher, String platform, int id) {
		final String UPDATE = "UPDATE `game` SET `name` = ?, `publisher` = ?, `platform` = ? WHERE `id` = ?;";
		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(UPDATE)) {
			stmt.setString(1, name);
			stmt.setString(2, publisher);
			stmt.setString(3, platform);
			stmt.setInt(4, id);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int deleteGame(int id) {
		final String DELETE = "DELETE FROM `game` WHERE `id` = ?;";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement stmt = conn.prepareStatement(DELETE)) {
			stmt.setInt(1, id);

			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
