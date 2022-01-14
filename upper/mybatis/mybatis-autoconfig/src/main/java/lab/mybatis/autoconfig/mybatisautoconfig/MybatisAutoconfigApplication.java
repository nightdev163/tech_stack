package lab.mybatis.autoconfig.mybatisautoconfig;

import lab.mybatis.autoconfig.mybatisautoconfig.exampleConfig.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import lab.mybatis.autoconfig.mybatisautoconfig.example.CityMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MybatisAutoconfigApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MybatisAutoconfigApplication.class, args);
	}
}
