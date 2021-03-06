package org.kurron.sdr

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.config.EnableMongoAuditing

@SpringBootApplication
@EnableConfigurationProperties( ApplicationProperties )
@EnableMongoAuditing
class Application {

	static void main( String[] args ) {
		SpringApplication.run( Application, args )
	}

	@Bean
	CustomApplicationRunner customApplicationRunner() {
		new CustomApplicationRunner()
	}
}
