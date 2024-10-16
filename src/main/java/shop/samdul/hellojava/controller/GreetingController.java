package shop.samdul.hellojava.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    ArrayList<People> plist = new ArrayList();
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
        People p = new People();
        p.setName(name);
        p.upper(p.getName());
        plist.add(p);
        p.setNum(plist.indexOf(p) + 1);
        model.addAttribute("plist", plist);
        return "greeting";
    }
}
