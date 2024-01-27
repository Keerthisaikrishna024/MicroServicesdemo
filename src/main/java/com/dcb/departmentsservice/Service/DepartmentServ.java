package com.dcb.departmentsservice.Service;

import com.dcb.departmentsservice.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentServ{
    public Department getDepartmentDetails();

    public Department saveDeptDetails(Department department);
}
