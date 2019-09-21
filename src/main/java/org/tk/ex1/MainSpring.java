package org.tk.ex1;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        ComponentInjectedMapper injectedMapper = ctx.getBean("componentInjectedMapper", ComponentInjectedMapper.class);

        SimpleSource source = new SimpleSource();
        source.setName("Source");
        source.setDescription("Conversion to destination");
        System.out.println(injectedMapper.getSimpleSourceDestinationMapper().sourceToDestination(source));
    }
}
