package rsubd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import rsubd.config.Config;
import rsubd.controllers.DivisionController;
import rsubd.services.DivisionService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {DivisionController.class, DivisionService.class, Config.class})
public class AppInit {
    public static void main(String[] args) {
        SpringApplication.run(AppInit.class, args);

    }
}