package shop.samdul.hellojava.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    ArrayList<String> plist = new ArrayList();
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
        People p = new People();
        p.name = name;
        p.upname = p.upper(p.name);
        plist.add(p.upname);
        p.num = plist.indexOf(p.upname);
        model.addAttribute("plist", plist);
        return "greeting";
    }
}
