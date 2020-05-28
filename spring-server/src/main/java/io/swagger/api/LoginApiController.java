package io.swagger.api;

import io.swagger.interfaces.LoginApi;
import io.swagger.model.LoginInformation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-28T06:14:18.281Z")

@Controller
public class LoginApiController implements LoginApi {

    private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deleteLoginInforation(@ApiParam(value = " to delete",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LoginInformation> getLoginInformation(@ApiParam(value = "information of a user to return",required=true) @PathVariable("username") String username) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoginInformation>(objectMapper.readValue("{  \"password\" : \"Abc@12345\",  \"role\" : \"admin\",  \"username\" : \"joniyed\"}", LoginInformation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoginInformation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoginInformation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> loginInformation(@ApiParam(value = "login_information object that needs to be added to the db" ,required=true )  @Valid @RequestBody LoginInformation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateLoginInformation(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = "Login inforation object that needs to be update" ,required=true )  @Valid @RequestBody LoginInformation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
