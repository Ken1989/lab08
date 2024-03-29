package cn.ibm.com.lab08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Lab08Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Lab08Application.class, args);
	}

	// For support local tomcat
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}
}
