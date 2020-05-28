package io.swagger.api;

import io.swagger.interfaces.MonhtMealApi;
import io.swagger.model.Meal;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-28T06:14:18.281Z")

@Controller
public class MonthMealApiController implements MonhtMealApi {

    private static final Logger log = LoggerFactory.getLogger(MonthMealApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MonthMealApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Meal> getMonthMeal(@ApiParam(value = "information of a user to return",required=true) @PathVariable("month") Integer month,@ApiParam(value = "information of a user to return",required=true) @PathVariable("year") String year) {
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

}
