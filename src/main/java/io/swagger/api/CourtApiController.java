package io.swagger.api;

import io.swagger.model.Court;
import io.swagger.model.CourtRating;
import io.swagger.model.ModelApiResponse;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-08T20:35:21.763Z[GMT]")
@RestController
public class CourtApiController implements CourtApi {

    private static final Logger log = LoggerFactory.getLogger(CourtApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CourtApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createCourt(@Parameter(in = ParameterIn.DEFAULT, description = "Created court object", required=true, schema=@Schema()) @Valid @RequestBody Court body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCourt(@Parameter(in = ParameterIn.PATH, description = "Court id to delete", required=true, schema=@Schema()) @PathVariable("courtId") Long courtId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Court> getCourtById(@Parameter(in = ParameterIn.PATH, description = "Id of court to return", required=true, schema=@Schema()) @PathVariable("courtId") Long courtId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Court>(objectMapper.readValue("{\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"location\" : \"location\",\n  \"id\" : 0\n}", Court.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Court>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Court>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Court>> getCourtsList(@Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "name", "location", "rating" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Court>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"location\" : \"location\",\n  \"id\" : 0\n}, {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"location\" : \"location\",\n  \"id\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Court>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Court>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CourtRating> rateCourt(@Parameter(in = ParameterIn.PATH, description = "Id of court to rate", required=true, schema=@Schema()) @PathVariable("courtId") Long courtId,@Parameter(in = ParameterIn.DEFAULT, description = "Rate object that needs to be added", required=true, schema=@Schema()) @Valid @RequestBody CourtRating body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CourtRating>(objectMapper.readValue("{\n  \"boardsQuality\" : 2,\n  \"id\" : 0,\n  \"surfaceQuality\" : 5,\n  \"userId\" : 6,\n  \"value\" : 1,\n  \"basketsQuality\" : 5\n}", CourtRating.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CourtRating>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CourtRating>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCourt(@Parameter(in = ParameterIn.DEFAULT, description = "Court object that needs to be updated", required=true, schema=@Schema()) @Valid @RequestBody Court body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadCourtImage(@Parameter(in = ParameterIn.PATH, description = "ID of court to update", required=true, schema=@Schema()) @PathVariable("courtId") Long courtId,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file) {
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

}
