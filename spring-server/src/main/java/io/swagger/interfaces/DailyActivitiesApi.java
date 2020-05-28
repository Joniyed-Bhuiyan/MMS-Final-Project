/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.interfaces;

import io.swagger.model.DailyActivities;
import io.swagger.model.DepositInformation;
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

@Api(value = "dailyActivities", description = "the dailyActivities API")
@RequestMapping(value = "/api/v1")
public interface DailyActivitiesApi {

    @ApiOperation(value = "add daily activities with date.", nickname = "addDailyActivities", notes = "This table holds the daily activities information.", tags={ "daily activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "information saved.."),
        @ApiResponse(code = 400, message = "bad request..") })
    @RequestMapping(value = "/dailyActivities",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addDailyActivities(@ApiParam(value = "daily activities object that needs to be added to the db" ,required=true )  @Valid @RequestBody DailyActivities body);


    @ApiOperation(value = "delete activity details.", nickname = "deleteActivity", notes = " delet details for a single activity.", tags={ "daily activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid month/year supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/dailyActivities/{activity_no}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteActivity(@ApiParam(value = "information of a user to return",required=true) @PathVariable("activity_no") String activityNo);


    @ApiOperation(value = "get acitvity information of a manager.", nickname = "getAllForMonth", notes = "Returns activiy information..", response = DepositInformation.class, tags={ "daily activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DepositInformation.class),
        @ApiResponse(code = 400, message = "Invalid month/year supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/dailyActivities/{month}/{year}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DepositInformation> getAllForMonth(@ApiParam(value = "information of a user to return",required=true) @PathVariable("month") Integer month,@ApiParam(value = "information of a user to return",required=true) @PathVariable("year") String year,@ApiParam(value = "information of a user to return",required=true) @PathVariable("manager_id") String managerId);


    @ApiOperation(value = "get sum of daily activities.", nickname = "getSumOfDailyActivities", notes = "Returns sum of cost information for a prticular month", tags={ "daily activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid month/year supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/dailyActivities/sum/{month}/{year}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> getSumOfDailyActivities(@ApiParam(value = "information of a user to return",required=true) @PathVariable("month") Integer month,@ApiParam(value = "information of a user to return",required=true) @PathVariable("year") String year);


    @ApiOperation(value = "update activity details.", nickname = "updateActivity", notes = " update details for a single activity.", tags={ "daily activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation"),
        @ApiResponse(code = 400, message = "Invalid month/year supplied"),
        @ApiResponse(code = 404, message = "information not found") })
    @RequestMapping(value = "/dailyActivities/{activity_no}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateActivity(@ApiParam(value = "information of a user to return",required=true) @PathVariable("activity_no") String activityNo);

}