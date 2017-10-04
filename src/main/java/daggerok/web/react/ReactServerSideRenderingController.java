package daggerok.web.react;

import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.System.currentTimeMillis;
import static lombok.AccessLevel.PRIVATE;

/**
 * Created by mak on 9/7/16.
 */
@Controller
@RequiredArgsConstructor
public class ReactServerSideRenderingController {

    final React react;

    @GetMapping({"/", "/404", "/not-found"})
    public String index(Model model) {
        model.addAttribute("currentTimeMillis", currentTimeMillis());
        model.addAttribute("html", react.renderApp());
        return "index";
    }
}
