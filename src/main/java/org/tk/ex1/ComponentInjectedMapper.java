package org.tk.ex1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class ComponentInjectedMapper {

    @Autowired
    SimpleSourceDestinationMapper simpleSourceDestinationMapper;


}
