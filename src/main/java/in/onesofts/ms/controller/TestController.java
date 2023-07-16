package in.onesofts.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/msg")
	public String showMessage(){
		return "Welcome to Devops tutorial";
	}
}
