import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@EnableEurekaServer
@Configuration
public class Example {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}