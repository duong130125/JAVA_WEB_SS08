package ra.session_08.controller.BT01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @GetMapping("/")
    public ModelAndView welcome() {
        return new  ModelAndView("welcome");
    }
}
