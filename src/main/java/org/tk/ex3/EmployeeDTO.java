package org.tk.ex3;

import lombok.Data;

@Data
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
}