package bootJPA.one;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Renjith
 * http://www.javainuse.com/spring/SpringBoot_DataJPA
 *
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication

public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}