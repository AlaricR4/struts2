package fr.formation.inti.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;
import fr.fromation.inti.config.AppConfiguration;

public class AppMain {
	 private final static Log log = LogFactory.getLog(AppMain.class);
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
		log.info("----- getBean--------");
		//IEmployeeService service = context.getBean("serviceEmployee",EmployeeService.class);
		IEmployeeService service = context.getBean("employeeService",EmployeeService.class);
		
		
		log.info("---------Bean service"+ service);
		
		List<Employee> employees = service.findAll();
		
		for(Employee e : employees)
			log.debug("-------"+e);
			
		context.close();
	}
	
}