package com.example.demo.controller;

import com.example.demo.service.AccountBalanceService;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

  private final Logger LOG = LoggerFactory.getLogger(UserController.class);

  private final UserService userService;

  private final AccountBalanceService accountBalanceService;

  public UserController(UserService userService, AccountBalanceService accountBalanceService) {
    this.userService = userService;
    this.accountBalanceService = accountBalanceService;
  }

  @Operation(summary = "Get user greeting", description = "Fetches a greeting message for the specified user.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Greeting fetched successfully"),
      @ApiResponse(responseCode = "400", description = "Invalid user parameter")
  })
  @GetMapping("/users/greeting")
  public ResponseEntity<String> getUserGreeting(
      @Parameter(
          description = "Optional parameter with a default value",
          required = true,
          schema = @Schema(type = "string", defaultValue = "000018b0e1a211ef95a30242ac180002")
      ) String user) {
    LOG.info("getUserGreeting : {}", user);

    String greetingMessage = userService.getGreeting(user);
    return new ResponseEntity<>(greetingMessage, HttpStatus.OK);
  }

  @Operation(
      summary = "Get user account balance",
      description = "Fetches the account balance for the specified user ID."
  )
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Account balance retrieved successfully"),
      @ApiResponse(responseCode = "404", description = "User not found"),
      @ApiResponse(responseCode = "500", description = "Internal server error")
  })
  @GetMapping("/users/{userId}/balance")
  public ResponseEntity<BigDecimal> getUserBalance(@Parameter(
      description = "The ID of the user whose account balance is to be retrieved",
      required = true,
      schema = @Schema(type = "string", defaultValue = "000018b0e1a211ef95a30242ac180002")
  )
  @PathVariable("userId") String user) {
    LOG.info("getUserBalance : {}", user);

    BigDecimal amount = accountBalanceService.getBalance(user);
    return new ResponseEntity<>(amount, HttpStatus.OK);
  }
}
