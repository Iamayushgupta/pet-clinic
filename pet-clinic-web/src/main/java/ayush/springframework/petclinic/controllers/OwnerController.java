package ayush.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    @RequestMapping({"/owners","/owners/list"})
    public String listOwner(){
        return "owners/index";
    }
}
