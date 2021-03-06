package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import org.springframework.core.io.Resource;
import io.swagger.model.User;
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
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> assignUserToRole(@Parameter(in = ParameterIn.PATH, description = "name that of user we want to get roles", required=true, schema=@Schema()) @PathVariable("username") String username,@Parameter(in = ParameterIn.PATH, description = "ID of game from which messages we want", required=true, schema=@Schema()) @PathVariable("roleId") Long roleId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created user object", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be deleted", required=true, schema=@Schema()) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUserByName(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched. Use user1 for testing. ", required=true, schema=@Schema()) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"password\" : \"password\",\n  \"role\" : \"role\",\n  \"level\" : \"newbie\",\n  \"id\" : 0,\n  \"email\" : \"email\",\n  \"age\" : 6,\n  \"username\" : \"username\",\n  \"height\" : 1\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUsersList(@Parameter(in = ParameterIn.QUERY, description = "The maximum number of results to retrieve" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "The zero-ary offset into the results" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "How to sort the results" ,schema=@Schema(allowableValues={ "id", "firstName", "lastName", "role", "level" }
, defaultValue="id")) @Valid @RequestParam(value = "sort", required = false, defaultValue="id") String sort) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"password\" : \"password\",\n  \"role\" : \"role\",\n  \"level\" : \"newbie\",\n  \"id\" : 0,\n  \"email\" : \"email\",\n  \"age\" : 6,\n  \"username\" : \"username\",\n  \"height\" : 1\n}, {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"password\" : \"password\",\n  \"role\" : \"role\",\n  \"level\" : \"newbie\",\n  \"id\" : 0,\n  \"email\" : \"email\",\n  \"age\" : 6,\n  \"username\" : \"username\",\n  \"height\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> loginUser(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The user name for login" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @Parameter(in = ParameterIn.QUERY, description = "The password for login in clear text" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> logoutUser() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> resetPassword(@Parameter(in = ParameterIn.PATH, description = "name that of user we want to get roles", required=true, schema=@Schema()) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "name that need to be updated", required=true, schema=@Schema()) @PathVariable("username") String username,@Parameter(in = ParameterIn.DEFAULT, description = "Updated user object", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadUserImage(@Parameter(in = ParameterIn.PATH, description = "name that of user we want to get roles", required=true, schema=@Schema()) @PathVariable("username") String username,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file) {
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
