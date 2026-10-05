package br.com.springProject.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	private Logger logger = LoggerFactory.getLogger(TestController.class.getName());
	@GetMapping("/test")
	public String testLog() {
		logger.info("Mensagem de log");
		logger.debug("debug no log");
		logger.warn("debug no log warn");
		
		return "Loggins gerados para Test";
	}
}
