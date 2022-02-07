package fr.formation.inti.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;
import fr.fromation.inti.config.AppConfiguration;

public class AppMain {
	private final static Log log = LogFactory.getLog(AppMain.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext();
		
		
		/*IEmployeeService service = context.getBean("employeeService", EmployeeService.class);
		log.info("--------------bean service "+service);
		List<Employee> employees = service.findAll();

		for (Employee e : employees)
			log.info("-------------------" + e);*/

	}
}
