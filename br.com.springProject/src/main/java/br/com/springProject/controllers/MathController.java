package br.com.springProject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
	
	
	@RequestMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new Exception();
		
		return converterToDouble(numberOne) +converterToDouble( numberTwo);
		}

	private Double converterToDouble(String number) {
		if(!isnumeric(number)) throw new IllegalArgumentException();
		return Double.valueOf(number);
	}

	private boolean isnumeric(String strnumber) {
		if(strnumber == null || strnumber.isEmpty()) return false;
		
		String number = strnumber.replace(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); 
	}
		
	
}
