package io.swagger.api;

import io.swagger.model.Game;
import io.swagger.model.GameRating;
import io.swagger.model.GameStats;
import io.swagger.model.Message;
import io.swagger.model.ModelApiResponse;
import io.swagger.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;

import aspects.MyAspect;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")
@RestController
public class GameApiController implements GameApi {

	@Autowired
	private GameService gameService;
	//without DI you can create service using new on a chosen class
	//private StudentService studentService = new StudentServiceInMemImpl();
	
    private static final Logger log = LoggerFactory.getLogger(GameApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GameApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Game> addGame(@Parameter(in = ParameterIn.DEFAULT, description = "Game object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Game body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Game>(gameService.addGame(body), HttpStatus.OK);
    }

    public ResponseEntity<Void> addMessage(@Parameter(in = ParameterIn.PATH, description = "Id of game", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.PATH, description = "Id of user that send message", required=true, schema=@Schema()) @PathVariable("userId") Long userId,@Parameter(in = ParameterIn.DEFAULT, description = "Message object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Message body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteGame(@Parameter(in = ParameterIn.PATH, description = "Game id to delete", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        gameService.deleteGameById(gameId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Game> getGameById(@Parameter(in = ParameterIn.PATH, description = "Id of game to return", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId) {
        String accept = request.getHeader("Accept");
        
        return new ResponseEntity<Game>(gameService.findGameById(gameId), HttpStatus.OK);
    }

    public ResponseEntity<List<Game>> getGamesList(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Location type values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "court", "sporthall" }
)) @Valid @RequestParam(value = "area", required = true) List<String> area,@Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "date", "price", "location" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort) {
        String accept = request.getHeader("Accept");
        var games = gameService.findAllGames();
    	return new ResponseEntity<List<Game>>(games, HttpStatus.OK);
    }

    public ResponseEntity<List<Message>> getMessagesList(@Parameter(in = ParameterIn.PATH, description = "ID of game from which messages we want", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "date" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Message>>(objectMapper.readValue("[ {\n  \"date\" : \"date\",\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"content\" : \"content\"\n}, {\n  \"date\" : \"date\",\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"content\" : \"content\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Game> joinGame(@Parameter(in = ParameterIn.PATH, description = "ID of game to join", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.PATH, description = "ID of user that want to join", required=true, schema=@Schema()) @PathVariable("userId") Long userId,@Parameter(in = ParameterIn.PATH, description = "Boolean if user have a ball", required=true, schema=@Schema()) @PathVariable("haveABall") String haveABall) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Game>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sportHallId\" : 1,\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"price\" : 5.962134,\n  \"gotBall\" : \"gotBall\",\n  \"id\" : 0,\n  \"playersMaxAmount\" : 5,\n  \"courtId\" : 6\n}", Game.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Game>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Game>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GameRating> rateGame(@Parameter(in = ParameterIn.PATH, description = "Id of game to rate", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.DEFAULT, description = "Rat object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody GameRating body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GameRating>(objectMapper.readValue("{\n  \"id\" : 0,\n  \"userId\" : 6,\n  \"value\" : 1\n}", GameRating.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GameRating>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GameRating>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Game> removeUserFromGame(@Parameter(in = ParameterIn.PATH, description = "ID of game", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.PATH, description = "ID of user that want to remove from game", required=true, schema=@Schema()) @PathVariable("userId") Long userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Game>(objectMapper.readValue("{\n  \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sportHallId\" : 1,\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"price\" : 5.962134,\n  \"gotBall\" : \"gotBall\",\n  \"id\" : 0,\n  \"playersMaxAmount\" : 5,\n  \"courtId\" : 6\n}", Game.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Game>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Game>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Game> updateGame(@Parameter(in = ParameterIn.DEFAULT, description = "Game object that needs to be updated", required=true, schema=@Schema()) @Valid @RequestBody Game body) {
        String accept = request.getHeader("Accept");
        
        return new ResponseEntity<Game>(gameService.updateGame(body),HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@Parameter(in = ParameterIn.PATH, description = "ID of game to update", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }
    
   
	public ResponseEntity<String> getStats() {
		
		GameStats gameStats =  MyAspect.GameStats();
		
		double g_prct = gameStats.getGET_PRC();
		int g = gameStats.getGET();
		
		double p_prct = gameStats.getPOST_PRC();
		int p = gameStats.getPOST();
		
		double d_prct = gameStats.getDEL_PRC();
		int d = gameStats.getDELETE();
		
		String get = "GET: |PRCT|: " + String.valueOf(g_prct) + " |ALL|: " + String.valueOf(g) + "\n"; 
		
		String post = "POST: |PRCT|: " + String.valueOf(p_prct) + " |ALL|: " + String.valueOf(p) + "\n"; 
		
		String del = "DEL: |PRCT|:" + String.valueOf(d_prct) + " |ALL|: " + String.valueOf(d); 
		
		
		String returnedObject = get + post + del;
		
		return ResponseEntity.ok(returnedObject);
	}
    
    
    

}
