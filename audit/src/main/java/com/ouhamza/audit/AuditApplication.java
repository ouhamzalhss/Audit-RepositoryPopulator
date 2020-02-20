package com.ouhamza.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
public class AuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditApplication.class, args);
	}

	@Bean
	AuditorAware auditor(){
		return () -> Optional.of("admin");
	}

	@Autowired
	private PersonRepo personRepo;

	  @Bean
	  CommandLineRunner start(){
	          return args->{
	         /*     List<Person> personList = Arrays.asList(
	             		 new Person(null,"ouhamza", "ouhamza@gmail.com",null,null),
						 new Person(null,"ali", "ali@gmail.com",null,null)
				 );*/

	              this.personRepo.save(new Person(null,"ouhamza", "ouhamza@gmail.com",null,null,null,null));


	          };
	       }
}
