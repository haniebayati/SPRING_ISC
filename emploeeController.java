package q1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import q1.model.emploee;
import q1.service.emploeeservice;

@RestController
@RequestMapping(value = "/employees")
public class emploeeController {
	
    @Autowired
    emploeeservice employeeService;
    
	@GetMapping(value= "/getemploee" , produces= "application/json")
	@ResponseBody
    public List<emploee> getEmployees()
    {
        return employeeService.listEmp();
    }

    @PostMapping(value="/postemploee", produces= "application/json" , consumes = "application/json")
    @ResponseBody
    public String addEmployees(@RequestBody emploee employees)
    {
        employeeService.createEmp(employees);
        return "Done" ;
    }
    
	@GetMapping(value= "/test" , produces= "application/json")
	@ResponseBody
    public String getHello()
    {
        return "hello";
    }


}
