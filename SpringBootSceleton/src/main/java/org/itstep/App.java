package org.itstep;

import org.itstep.service.TestService;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alex Ignatenko
 *
 */

@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	          new AnnotationConfigApplicationContext(App.class);
    	
    	
    	TestService service = new TestService();
    	
    	service.testSpring();
    	
    }

    
	
}
