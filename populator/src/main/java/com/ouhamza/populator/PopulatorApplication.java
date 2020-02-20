package com.ouhamza.populator;

import com.ouhamza.populator.dao.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class PopulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PopulatorApplication.class, args);
	}

	@Autowired
	private PersonRepo personRepo;

	@Bean
	Jackson2RepositoryPopulatorFactoryBean reposutoryPopulate(){
		Jackson2RepositoryPopulatorFactoryBean factoryBean = new Jackson2RepositoryPopulatorFactoryBean();
		factoryBean.setResources(new Resource[]{new ClassPathResource("data.json")});
		return factoryBean;
	}

	@Bean
	CommandLineRunner start(){
	          return args->{
				  System.out.println(this.personRepo.findAll());
	          };
	}

}
