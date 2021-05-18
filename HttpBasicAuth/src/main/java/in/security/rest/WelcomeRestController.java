package in.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security-app/v1")
public class WelcomeRestController {

		@GetMapping("/")
		public String massege()
		{
			return "Welcome to Security Application...";
		}
}
