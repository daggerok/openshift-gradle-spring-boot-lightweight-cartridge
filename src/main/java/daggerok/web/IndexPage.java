package daggerok.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.System.currentTimeMillis;

/**
 * Created by mak on 9/12/16.
 */
@Controller
public class IndexPage {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("currentTimeMillis", currentTimeMillis());
        return "index";
    }
}
