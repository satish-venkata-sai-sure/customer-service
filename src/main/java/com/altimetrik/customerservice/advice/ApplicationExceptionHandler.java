package com.altimetrik.customerservice.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.altimetrik.customerservice.exception.ResourceNotFoundException;


@RestControllerAdvice
public class ApplicationExceptionHandler {
	//ResourceNotFoundException
		@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(ResourceNotFoundException.class)
	    public Map<String, String> resourceNotFoundException(ResourceNotFoundException ex) {
	      
			Map<String, String> errorMap = new HashMap<>();
	        errorMap.put("errorMessage", ex.getMessage());
	        return errorMap;
	    }
}
