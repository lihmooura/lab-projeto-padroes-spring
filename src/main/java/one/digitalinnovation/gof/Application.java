package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;

@EnableFeignClientes
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args)
	}
}
