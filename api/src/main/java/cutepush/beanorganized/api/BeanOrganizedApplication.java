package cutepush.beanorganized.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "cutepush.beanorganized.api",
    "cutepush.beanorganized.domain"
})
public class BeanOrganizedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanOrganizedApplication.class, args);
    }

}

