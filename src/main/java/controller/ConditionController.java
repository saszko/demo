package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.ConditionService;

@Controller
public class ConditionController {
    ConditionService conditionService;

    @Autowired
    public  void setConditionService(ConditionService conditionService){
        this.conditionService = conditionService;
    }

    @RequestMapping(value = "/sensor", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("sensor", conditionService.getIndicatorsByControllerId("kk"));
        System.out.println("Returning rpoducts:");
        return "products";
    }
}
