package br.com.springProject.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	
	@RequestMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum( 
			@PathParam("numberOne") String numberOne,
			@PathParam("numberTwo") String numberTwo
	) {
		return 1D;
	}
}
