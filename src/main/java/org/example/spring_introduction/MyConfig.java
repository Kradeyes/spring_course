package org.example.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("org.example.spring_introduction")
public class MyConfig {

    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person myPersonBean() {
        return new Person(catBean());
    }
}
