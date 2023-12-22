package trolls.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/homevisit")
	public String welcome()
	{
		return "This is home";
	}
}
