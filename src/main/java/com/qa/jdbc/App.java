package com.qa.jdbc;

public class App {

	public static void main(String[] args) {
		GameDAO game = new GameDAO("jdbc:mysql://localhost:3306/dfe_sw12", "root", "pass");

		System.out.println(game.readGames());
		game.createGame("Tales of Arise", "Bandai Namco", "PS5");

		System.out.println(game.readGames());
		game.createGame("DMC 5 Special Edition", "Capcom", "PS5");

		System.out.println(game.readGames());
		game.createGame("Ghost of Tsushima", "Sony", "PS5");

		System.out.println(game.readGames());
		game.updateGame("Deep Rock Galactic", "Ghost Ship Games?", "PS5", 3);

		System.out.println(game.readGames());
		game.deleteGame(2);

		System.out.println(game.readGames());

		game.readGames().stream().filter(g -> g.getPublisher().equals("Sony")).forEach(System.out::println);
	}

}
