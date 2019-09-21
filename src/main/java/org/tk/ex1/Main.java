package org.tk.ex1;

import org.mapstruct.factory.Mappers;

public class Main {

    private static SimpleSourceDestinationMapper mapper
            = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    public static void main(String[] args) {

        SimpleSource source = new SimpleSource();
        source.setName("Source");
        source.setDescription("Conversion to destination");
        SimpleDestination destination = mapper.sourceToDestination(source);
        System.out.println(destination);
    }
}
