package io.swagger.api;

import io.swagger.interfaces.DepositApi;
import io.swagger.model.DepositInformation;
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
public class DepositApiController implements DepositApi {

    private static final Logger log = LoggerFactory.getLogger(DepositApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepositApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMoney(@ApiParam(value = "login_information object that needs to be added to the db" ,required=true )  @Valid @RequestBody DepositInformation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDeposit(@ApiParam(value = " to delete",required=true) @PathVariable("depositId") String depositId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepositInformation> getMonthDeposit(@ApiParam(value = "information of a user to return",required=true) @PathVariable("month") Integer month,@ApiParam(value = "information of a user to return",required=true) @PathVariable("year") String year) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositInformation>(objectMapper.readValue("{  \"deposit_no\" : 0,  \"member_id\" : 1,  \"date\" : \"2020-10-20\",  \"amount\" : 6}", DepositInformation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositInformation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositInformation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepositInformation> getMonthDepositforMember(@ApiParam(value = "information of a user to return",required=true) @PathVariable("month") Integer month,@ApiParam(value = "information of a user to return",required=true) @PathVariable("year") String year,@ApiParam(value = "information of a user to return",required=true) @PathVariable("member_id") String memberId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositInformation>(objectMapper.readValue("{  \"deposit_no\" : 0,  \"member_id\" : 1,  \"date\" : \"2020-10-20\",  \"amount\" : 6}", DepositInformation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositInformation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositInformation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDeposit(@ApiParam(value = " to delete",required=true) @PathVariable("depositId") Integer depositId,@ApiParam(value = "meal object that needs to be update" ,required=true )  @Valid @RequestBody DepositInformation body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
