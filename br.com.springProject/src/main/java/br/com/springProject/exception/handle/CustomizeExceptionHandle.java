package br.com.springProject.exception.handle;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.springProject.exception.ExceptionResponse;
import br.com.springProject.exception.UnSuportOperationException;

@RestController
@ControllerAdvice
public class CustomizeExceptionHandle extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setTimestamp(new Date());
		exceptionResponse.setMessage(ex.getMessage());
		exceptionResponse.setDetails(request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnSuportOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleUnSuportException(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setTimestamp(new Date());
		exceptionResponse.setMessage(ex.getMessage());
		exceptionResponse.setDetails(request.getDescription(false));
		
		return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
