package io.swagger.api;

import io.swagger.interfaces.MealApi;
import io.swagger.model.LoginInformation;
import io.swagger.model.Meal;
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
public class MealApiController implements MealApi {

    private static final Logger log = LoggerFactory.getLogger(MealApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MealApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMeal(@ApiParam(value = "meal object that needs to be added to the db" ,required=true )  @Valid @RequestBody Meal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteMeal(@ApiParam(value = " to delete",required=true) @PathVariable("username") String username,@ApiParam(value = " to delete",required=true) @PathVariable("date") String date) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Meal> getAllMeal() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Meal>(objectMapper.readValue("{  \"member_id\" : 5,  \"date\" : \"2020-10-20\",  \"lunch\" : 1,  \"id\" : 0,  \"breakfast\" : 5,  \"dinner\" : 6}", Meal.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Meal>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Meal>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LoginInformation> getMeal(@ApiParam(value = "information of a user to return",required=true) @PathVariable("username") String username,@ApiParam(value = "information of a user to return",required=true) @PathVariable("date") String date) {
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

    public ResponseEntity<Void> updateMeal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = " to delete",required=true) @PathVariable("date") String date,@ApiParam(value = "meal object that needs to be update" ,required=true )  @Valid @RequestBody Meal body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
