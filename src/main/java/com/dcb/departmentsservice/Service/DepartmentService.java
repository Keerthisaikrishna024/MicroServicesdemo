package com.dcb.departmentsservice.Service;

import com.dcb.departmentsservice.Entity.Department;
import com.dcb.departmentsservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements DepartmentServ{

    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department getDepartmentDetails() {
        return null;
    }

    @Override
    public Department saveDeptDetails(Department department) {
        return departmentRepository.save(department);
    }
}
