package io.swagger.service;

import java.util.List;

import io.swagger.model.Game;


public interface GameService {
	public Game addGame(Game game);
	public List<Game> findAllGames();
}
