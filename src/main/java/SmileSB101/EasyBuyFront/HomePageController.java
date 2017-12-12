package SmileSB101.EasyBuyFront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping("/")
	public String home() {
		return "HomePage";
	}
}
