/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Game;
import io.swagger.model.GameRating;
import io.swagger.model.Message;
import io.swagger.model.ModelApiResponse;
import org.springframework.core.io.Resource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")
@Validated
public interface GameApi {

    @Operation(summary = "Add a new game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/game",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Game> addGame(@Parameter(in = ParameterIn.DEFAULT, description = "Game object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Game body);


    @Operation(summary = "Add a new message", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/game/{gameId}/message/{userId}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addMessage(@Parameter(in = ParameterIn.PATH, description = "Id of game", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.PATH, description = "Id of user that send message", required=true, schema=@Schema()) @PathVariable("userId") Long userId, @Parameter(in = ParameterIn.DEFAULT, description = "Message object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody Message body);


    @Operation(summary = "Deletes a game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Game not found") })
    @RequestMapping(value = "/game/{gameId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGame(@Parameter(in = ParameterIn.PATH, description = "Game id to delete", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey);


    @Operation(summary = "Finds games by gameId", description = "Multiple status values can be provided with comma separated strings", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Game.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Game not found") })
    @RequestMapping(value = "/game/{gameId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Game> getGameById(@Parameter(in = ParameterIn.PATH, description = "Id of game to return", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId);


    @Operation(summary = "Get games list", description = "Location type values can be provided with comma separated strings", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Game.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid locationType value") })
    @RequestMapping(value = "/game",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Game>> getGamesList(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Location type values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "court", "sporthall" }
)) @Valid @RequestParam(value = "area", required = true) List<String> area, @Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit, @Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "date", "price", "location" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort);


    @Operation(summary = "Get messages list", description = "Location type values can be provided with comma separated strings", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Message.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid gameId value") })
    @RequestMapping(value = "/game/{gameId}/message",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Message>> getMessagesList(@Parameter(in = ParameterIn.PATH, description = "ID of game from which messages we want", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit, @Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "date" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort);


    @Operation(summary = "Join player to game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Game.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/game/{gameId}/join/{userId}/{haveABall}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Game> joinGame(@Parameter(in = ParameterIn.PATH, description = "ID of game to join", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.PATH, description = "ID of user that want to join", required=true, schema=@Schema()) @PathVariable("userId") Long userId, @Parameter(in = ParameterIn.PATH, description = "Boolean if user have a ball", required=true, schema=@Schema()) @PathVariable("haveABall") String haveABall);


    @Operation(summary = "Rate game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = GameRating.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/game/{gameId}/rate",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<GameRating> rateGame(@Parameter(in = ParameterIn.PATH, description = "Id of game to rate", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.DEFAULT, description = "Rat object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody GameRating body);


    @Operation(summary = "Remove user from game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Game.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/game/{gameId}/remove/{userId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Game> removeUserFromGame(@Parameter(in = ParameterIn.PATH, description = "ID of game", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.PATH, description = "ID of user that want to remove from game", required=true, schema=@Schema()) @PathVariable("userId") Long userId);


    @Operation(summary = "Update an existing game", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Game not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/game",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Game> updateGame(@Parameter(in = ParameterIn.DEFAULT, description = "Game object that needs to be updated", required=true, schema=@Schema()) @Valid @RequestBody Game body);


    @Operation(summary = "Uploads an image", description = "", tags={ "game" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = ModelApiResponse.class))) })
    @RequestMapping(value = "/game/{gameId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" }, 
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> uploadFile(@Parameter(in = ParameterIn.PATH, description = "ID of game to update", required=true, schema=@Schema()) @PathVariable("gameId") Long gameId, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata, @Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file);

    
    @Operation(summary = "get games stats", description = "", tags={ "game" })
        @ApiResponses(value = { 
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = String.class))) })
        @RequestMapping(value = "/stats",
            produces = { "application/json" }, 
            method = RequestMethod.GET)
    ResponseEntity<String> getStats();
}

