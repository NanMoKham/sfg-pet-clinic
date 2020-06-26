package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"", "/", "/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
