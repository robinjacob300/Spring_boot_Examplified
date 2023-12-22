package trolls.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommandController {

	@GetMapping("/commandCenters")
	public String CommandCntrl(Model model) {
		
		model.addAttribute("corps", "vals");
		return "command";
	}
}
