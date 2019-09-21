package org.tk.ex2;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public class Main {
    private static EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("ABC Employee");

        System.out.println(mapper.employeeToEmployeeDTO(employee));

    }
}
