package org.worldbuild.awsecscicd;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.worldbuild.core.config.CoreConfiguration;

import java.util.Date;

@Data
@Slf4j
@Import(CoreConfiguration.class)
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Current Date =====> "+new Date());
	}
}
