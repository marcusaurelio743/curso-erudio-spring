package br.com.springProject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springProject.exception.UnSuportOperationException;

@RestController
@RequestMapping("/math")
public class MathController {
	
	
	@RequestMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return converterToDouble(numberOne) +converterToDouble( numberTwo);
		}
	
	@RequestMapping("/sub/{numberOne}/{numberTwo}")
	public Double sub  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return converterToDouble(numberOne) - converterToDouble( numberTwo);
		}
	
	@RequestMapping("/multi/{numberOne}/{numberTwo}")
	public Double multi  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return converterToDouble(numberOne) * converterToDouble( numberTwo);
		}
	
	@RequestMapping("/div/{numberOne}/{numberTwo}")
	public Double div  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return converterToDouble(numberOne) / converterToDouble( numberTwo);
		}
	
	@RequestMapping("/media/{numberOne}/{numberTwo}")
	public Double media  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! isnumeric(numberOne) || ! isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return (converterToDouble(numberOne) + converterToDouble( numberTwo)) /2;
		}
	
	@RequestMapping("/raiz/{number}")
	public Double raiz  ( 
			@PathVariable("number") String number
			
	) throws Exception {
		if(! isnumeric(number) ) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return (Math.sqrt(converterToDouble(number)));
		}
	

	private Double converterToDouble(String number) {
		if(!isnumeric(number)) throw new UnSuportOperationException("please set is numeric value");
		return Double.valueOf(number);
	}

	private boolean isnumeric(String strnumber) {
		if(strnumber == null || strnumber.isEmpty()) return false;
		
		String number = strnumber.replace(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); 
	}
		
	
}
