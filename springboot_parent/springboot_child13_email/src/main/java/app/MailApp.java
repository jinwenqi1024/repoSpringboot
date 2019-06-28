package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"service","controller"})
public class MailApp {
    public static void main(String[] args) {
        SpringApplication.run(MailApp.class,args);
    }
}
