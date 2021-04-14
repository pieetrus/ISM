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

}
