import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.yathushan.training.salesmanager.repository.EmployeeRepository;
import com.yathushan.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.yathushan.training.salesmanager.service.EmployeeService;
import com.yathushan.training.salesmanager.service.EmployeeServiceImpl;


@Configuration
@ComponentScan("com.yathushan.training.salesmanager.model.Employee")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name ="employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		//employeeService.setEmployeeRepository(getEmployeeRepository());
		
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean(name ="employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		return new HibernateEmployeeRepositoryImpl();
	}

}
