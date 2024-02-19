package divan.springframework.divanarticlewebapp.controllers;

import divan.springframework.divanarticlewebapp.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @RequestMapping("/employees")
    public String getEmployees (Model model){
        model.addAttribute("emolyees" , employeeService.findAll());
        return "employees";

    }
}
