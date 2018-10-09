/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.SdkGameServer;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-30T13:45:08.782-04:00")

@Api(value = "gameserver", description = "the gameserver API")
public interface GameserverApi {

    @ApiOperation(value = "Retrieve the current GameServer data", nickname = "getGameServer", notes = "", response = SdkGameServer.class, tags={ "SDK", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = SdkGameServer.class) })
    @RequestMapping(value = "/gameserver",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<SdkGameServer> getGameServer();

}
