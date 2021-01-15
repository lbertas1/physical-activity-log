package bartos.lukasz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhysicalActivityLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhysicalActivityLogApplication.class, args);
    }

}
