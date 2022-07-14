package ayush.springframework.petclinic.controllers;

import ayush.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService){
        this.ownerService=ownerService;
    }
    @RequestMapping({"/list"})
    public String listOwner(Model model){
        model.addAttribute("owners" , ownerService.findAll());
        return "owners/index";
    }
    @RequestMapping("find")
    public String find(){
        return "notimpl";
    }

}
