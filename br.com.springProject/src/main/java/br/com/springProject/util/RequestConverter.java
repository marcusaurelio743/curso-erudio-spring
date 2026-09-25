package br.com.springProject.util;

import br.com.springProject.exception.UnSuportOperationException;

public class RequestConverter {
	
	public static Double converterToDouble(String number) {
		if(!isnumeric(number)) throw new UnSuportOperationException("please set is numeric value");
		return Double.valueOf(number);
	}

	public static boolean isnumeric(String strnumber) {
		if(strnumber == null || strnumber.isEmpty()) return false;
		
		String number = strnumber.replace(",", ".");
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); 
	}

}
