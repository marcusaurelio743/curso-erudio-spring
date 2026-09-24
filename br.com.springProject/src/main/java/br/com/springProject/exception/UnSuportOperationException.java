package br.com.springProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnSuportOperationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnSuportOperationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
