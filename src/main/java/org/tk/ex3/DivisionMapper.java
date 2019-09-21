package org.tk.ex3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DivisionMapper {

    @Mappings({
            @Mapping(target = "divisionId", source = "entity.id"),
            @Mapping(target = "divisionName", source = "entity.name")
    })
    DivisionDTO divisionToDivisionDTO(Division entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.divisionId"),
            @Mapping(target = "name", source = "dto.divisionName")
    })
    Division divisionDTOtoDivision(DivisionDTO dto);
}
