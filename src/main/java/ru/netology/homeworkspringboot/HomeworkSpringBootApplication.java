package ru.netology.homeworkspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HomeworkSpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(HomeworkSpringBootApplication.class, args);
        ProductionProfile productionProfile = context.getBean(ProductionProfile.class);
        DevProfile devProfile = context.getBean(DevProfile.class);
    }

}
