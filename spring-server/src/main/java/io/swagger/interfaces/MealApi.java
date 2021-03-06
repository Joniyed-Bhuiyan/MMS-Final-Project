/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.interfaces;

import io.swagger.model.LoginInformation;
import io.swagger.model.Meal;
import io.swagger.annotations.*;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-28T06:14:18.281Z")

@Api(value = "meal", description = "the meal API")
@RequestMapping(value = "/api/v1")
public interface MealApi {

    @ApiOperation(value = "register with new username and password", nickname = "addMeal", notes = "This table holds the secret information of member/manager/admins", tags={ "meal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "information saved.."),
        @ApiResponse(code = 400, message = "bad request..") })
    @RequestMapping(value = "/meal",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addMeal(@ApiParam(value = "meal object that needs to be added to the db" ,required=true )  @Valid @RequestBody Meal body);


    @ApiOperation(value = "Deletes a meal information", nickname = "deleteMeal", notes = "Delete meal information of a user.", tags={ "meal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "meal deleted successfuly"),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "meal not found") })
    @RequestMapping(value = "/meal/{username}/{date}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMeal(@ApiParam(value = " to delete",required=true) @PathVariable("username") String username,@ApiParam(value = " to delete",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "get meal information.", nickname = "getAllMeal", notes = "Returns meal information.", response = Meal.class, tags={ "meal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Meal.class),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/meal",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Meal> getAllMeal();


    @ApiOperation(value = "get meal information of a user.", nickname = "getMeal", notes = "Returns a single meal information for a prticular date", response = LoginInformation.class, tags={ "meal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = LoginInformation.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/meal/{username}/{date}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<LoginInformation> getMeal(@ApiParam(value = "information of a user to return",required=true) @PathVariable("username") String username,@ApiParam(value = "information of a user to return",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "Update an existing meal informatin", nickname = "updateMeal", notes = "Update meal.", tags={ "meal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successfull"),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/meal/{username}/{date}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateMeal(@ApiParam(value = "",required=true) @PathVariable("username") String username,@ApiParam(value = " to delete",required=true) @PathVariable("date") String date,@ApiParam(value = "meal object that needs to be update" ,required=true )  @Valid @RequestBody Meal body);

}
