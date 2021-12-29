package io.groovy.spring.config

import jakarta.validation.ValidatorFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver

import javax.xml.validation.Validator;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="io.groovy.spring")
class DemoAppGroovyConfig {

    // define a bean for ViewResolver

    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
