package io.swagger.service;

import java.util.List;

import io.swagger.model.Game;


public interface GameService {
	public Game addGame(Game game);
	public List<Game> findAllGames();
	public Game findGameById(long id);
	public Game deleteGameById(long id);
	public Game updateGame(Game game);
	public Game removeUserFromGame(long gameId, long userId);
	public Game assignUserToGame(long gameId, long userId);
//	addMessage
//	getMessagesList
//	rateGame
//	uploadFile
}
