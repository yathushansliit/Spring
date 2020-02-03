import java.applet.AppletContext;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yathushan.training.salesmanager.service.*;
import com.yathushan.training.salesmanager.model.*;

public class Application {

	public static void main(String[] args) {
		//EmployeeService employeeService = new EmployeeServiceImpl();
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.toString());
		
		EmployeeService employeeService2 = applicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService2.toString());
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " At " + employee.getEmployeeLocation());
		}
		

	}

}
