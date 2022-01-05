package io.groovy.spring.config

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource
import org.hibernate.SessionFactory
import org.hibernate.cfg.Environment
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.context.support.ResourceBundleMessageSource
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc
;
import org.springframework.web.servlet.view.InternalResourceViewResolver

import javax.sql.DataSource


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="io.groovy.spring")
//@PropertySource("classpath:messages.properties")
class DemoAppGroovyConfig {

    // define a bean for ViewResolver

    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    ResourceBundleMessageSource messageSource() {

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setUseCodeAsDefaultMessage(true)
        return messageSource;
    }

}
