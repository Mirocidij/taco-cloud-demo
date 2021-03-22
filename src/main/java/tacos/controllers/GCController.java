package tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GCController {
    @GetMapping("gc")
    public String gc() {
        System.gc();

        return "redirect:/";
    }
}
