package io.swagger.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Game;

@Service
@Transactional
public class GameServiceImpl implements GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Override
	public List<Game> findAllGames() {
		return gameRepository.findAll();
	}

	@Override
	public Game addGame(Game game) {
		return gameRepository.save(game);
	}

	@Override
	public Game findGameById(long id) {
		var game = gameRepository.findById(id);
		if(game.isPresent()) return game.get();
		else return null;
	}

	@Override
	public Game deleteGameById(long id) {
		var game = gameRepository.findById(id);
		if(game.isPresent()) gameRepository.deleteById(id);
		return game.get();
	}

	@Override
	public Game updateGame(Game game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game removeUserFromGame(long gameId, long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game assignUserToGame(long gameId, long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
