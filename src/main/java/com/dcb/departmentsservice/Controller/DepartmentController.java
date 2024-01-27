package com.dcb.departmentsservice.Controller;

import com.dcb.departmentsservice.Entity.Department;
import com.dcb.departmentsservice.Service.DepartmentServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentServ departmentServ;

    @PostMapping("/savedata")
    public Department saveDeptDetails(@RequestBody Department department)
    {
        return departmentServ.saveDeptDetails(department);
    }

    @GetMapping("/getdetails")
    public Department getDepartmentDetails()
    {
        return departmentServ.getDepartmentDetails();
    }
}
