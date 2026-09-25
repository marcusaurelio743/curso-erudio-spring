package br.com.springProject.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springProject.exception.UnSuportOperationException;
import br.com.springProject.service.MatchSimple;
import br.com.springProject.util.RequestConverter;

@RestController
@RequestMapping("/math")
public class MathController {
	private MatchSimple math = new MatchSimple();
	
	@RequestMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! RequestConverter.isnumeric(numberOne) || ! RequestConverter.isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.sum( RequestConverter.converterToDouble(numberOne) ,RequestConverter.converterToDouble( numberTwo));
		}
	
	@RequestMapping("/sub/{numberOne}/{numberTwo}")
	public Double sub  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! RequestConverter.isnumeric(numberOne) || ! RequestConverter.isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.sub(RequestConverter.converterToDouble(numberOne) , RequestConverter.converterToDouble( numberTwo));
		}
	
	@RequestMapping("/multi/{numberOne}/{numberTwo}")
	public Double multi  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! RequestConverter.isnumeric(numberOne) || ! RequestConverter.isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.sub(RequestConverter.converterToDouble(numberOne), RequestConverter.converterToDouble( numberTwo));
		}
	
	@RequestMapping("/div/{numberOne}/{numberTwo}")
	public Double div  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(!RequestConverter.isnumeric(numberOne) || ! RequestConverter.isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.div(RequestConverter.converterToDouble(numberOne), RequestConverter.converterToDouble( numberTwo));
		}
	
	@RequestMapping("/media/{numberOne}/{numberTwo}")
	public Double media  ( 
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
	) throws Exception {
		if(! RequestConverter.isnumeric(numberOne) || ! RequestConverter.isnumeric(numberTwo)) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.media(RequestConverter.converterToDouble(numberOne) , RequestConverter.converterToDouble( numberTwo));
		}
	
	@RequestMapping("/raiz/{number}")
	public Double raiz  ( 
			@PathVariable("number") String number
			
	) throws Exception {
		if(! RequestConverter.isnumeric(number) ) 
			throw new UnSuportOperationException("please set is numeric value");
		
		return math.raiz( RequestConverter.converterToDouble(number));
		}
	

	
		
	
}
