package org.tk.ex3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target = "employeeId", source = "entity.id"),
            @Mapping(target = "employeeName", source = "entity.name"),
            @Mapping(target = "employeeStartDate", source = "entity.startDate",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")})
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.employeeId"),
            @Mapping(target = "name", source = "dto.employeeName"),
            @Mapping(target = "startDate", source = "dto.employeeStartDate",
                    dateFormat = "dd-MM-yyyy HH:mm:ss")})
    Employee employeeDTOtoEmployee(EmployeeDTO dto);
}
