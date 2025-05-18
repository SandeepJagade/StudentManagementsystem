package com.naknih.student.management.custom.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.naknih.student.managemnet.utils.ErrorDetails;


@RestControllerAdvice
public class CustomExceptions extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(EmailAlreadyPresentException.class)
	public final ResponseEntity<ErrorDetails> emailAlreadyPresentException(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = new ErrorDetails("FAIL" , LocalDateTime.now(), 
				ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.CONFLICT);
		
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = new ErrorDetails("FAIL", LocalDateTime.now(), 
				"OOPS, Sorry, there is an error, Please contact admin", request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
