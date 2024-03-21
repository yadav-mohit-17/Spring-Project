package abc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/request")
	public String request() {
		return "Request Processed...";
	}
	
	@GetMapping("/hello")
	public String getData() {
		return "hello world";
	}
	@PostMapping("/welcome")
	public String sayWelcome() {
		return "Welcome To Spring MVC";
	}
	
	@PutMapping("/update")
	public String update() {
		return "Updated Successfully...";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "Deleted Successfully...";
	}
	
	@PatchMapping("/patch")
	public String patch() {
		return "Patching successfully...";
	}
}
