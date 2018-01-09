package com.qlective.com;

import javafx.application.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sun.tools.jar.CommandLine;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class QlectiveKerenceApplication
{
    public static void main(String[] args) {
        SpringApplication.run(QlectiveKerenceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            String[] beanNames = ctx.getBeanDefinitionNames();
            for(String beanName: beanNames){
                System.out.println(beanName);
            }
        };
    }
}
