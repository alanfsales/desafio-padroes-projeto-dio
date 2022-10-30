package dio.pp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioPadroesProjetoDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesProjetoDioApplication.class, args);
	}

}
