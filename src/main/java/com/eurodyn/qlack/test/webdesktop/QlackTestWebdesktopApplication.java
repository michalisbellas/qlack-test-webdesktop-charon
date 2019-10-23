package com.eurodyn.qlack.test.webdesktop;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

/**
 * Spring boot application class
 *
 * @author European Dynamics SA.
 */
@Log
@SpringBootApplication
public class QlackTestWebdesktopApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(QlackTestWebdesktopApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
