package demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import demo.model.Employee;
import demo.service.EmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
    EmployeeService  emplService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
      
        log.info("********Start Logging From Main Method******");
        log.info("********Hello Spring Boot Seed******");
        log.info("********End Logging From Main Method********");
    }
    
    @Bean
    public CommandLineRunner run() throws Exception {
    	
    	System.out.println("********Start CommandLineRunner******");
    	Employee empl1 = new Employee("16", "test","test","test");
		emplService.insert(empl1);
		
    	List<Employee> emplAll = emplService.findAll();
    	for (Employee empl:emplAll) {
    		System.out.println("Employee UserId: " + empl.getUserId());
    	}
    	System.out.println("********End CommandLineRunner******");
    	
    	return null;
    }

    public String convertToUpperCase (String str){
 	   return str.toUpperCase();
	}
}