package br.com.springProject.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.springProject.model.Greeting;

@RestController
public class GreetinController {
	
	private static final String template = "Hello %s ,!!";
	private AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(
			@RequestParam(value = "name",defaultValue = "word")
			String name
	
	) {
		
		Greeting greeting = new Greeting();
		greeting.setId(counter.incrementAndGet());
		greeting.setContent(String.format(template,name));
		return greeting;
		
	}

}
