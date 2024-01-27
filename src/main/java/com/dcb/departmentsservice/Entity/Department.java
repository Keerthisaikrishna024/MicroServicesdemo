package com.dcb.departmentsservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Department_Data")
public class Department {

    private long id;
    private String emp_Name;
    private String deptName;
    private long Salary;
}
