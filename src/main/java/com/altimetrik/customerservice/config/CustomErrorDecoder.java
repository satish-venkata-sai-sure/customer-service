package com.altimetrik.customerservice.config;

import org.springframework.http.HttpStatus;

import com.altimetrik.customerservice.exception.ResourceNotFoundException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
		if (response.status() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            return new ResourceNotFoundException("Resource not found for the given paraemeter");
        }
		return new ErrorDecoder.Default().decode(methodKey, response);   
	}

}
