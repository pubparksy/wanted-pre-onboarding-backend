package com.company.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "index";
    }
    
    @Autowired
    EmpService service;
    
    @RequestMapping(value = "/empSelect.do", method = RequestMethod.GET)
    public String empSelect(Model model) {
        String result = service.empSelect();
        model.addAttribute("result", result);
        return "empSelect";
    }

}
