package tacos.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.models.Order;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @GetMapping("current")
    public String orderForm(Model model) {
        log.info("IN OrdersController's orderForm method");

        model.addAttribute("order", new Order());

        return "orderForm";
    }

    @PostMapping
    public String processOrder(Order order) {
        log.info("Order submitted: " + order);

        return "redirect:/";
    }
}
