package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Trying to config JPA with xml file jpaContext.xml
 * @author konstr
 * example here -http://www.baeldung.com/2011/12/13/the-persistence-layer-with-spring-3-1-and-jpa/
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.example" })
@ImportResource({ "classpath:jpaContext.xml" })
@EnableJpaRepositories(basePackages="com.example.repository")   //Enable SpringData    
public class PersistanceConfigXML {
    
    public PersistanceConfigXML() {
        super();
    }

}
