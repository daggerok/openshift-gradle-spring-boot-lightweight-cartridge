package daggerok.web.react;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.System.currentTimeMillis;

/**
 * Created by mak on 9/7/16.
 */
@Controller
public class ReactServerSideRenderingController {

    final React react;

    public ReactServerSideRenderingController(React react) {
        this.react = react;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("currentTimeMillis", currentTimeMillis());
        model.addAttribute("data", react.renderApp());
        return "index";
    }
}
