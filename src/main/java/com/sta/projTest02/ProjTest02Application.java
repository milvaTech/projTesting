package com.sta.projTest02;


import com.sta.projTest02.model.Activity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ProjTest02Application {

	@Value("${api.url}")
	private String apiURL;
	private static final Logger log = LoggerFactory.getLogger(ProjTest02Application.class);

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to MilvaTech";
	}

	@GetMapping("/hello")
	public String hello(){
		return "Welcome to MilvaTech";
	}

	public static void main(String[] args) {
		log.info("In main method..");
		SpringApplication.run(ProjTest02Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return results -> {
			Activity activity = restTemplate.getForObject(apiURL, Activity.class);
			log.info(activity.toString());
		};
	}


}
/*
	create a new repository on the command line
        echo "# projTesting" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/milvaTech/projTesting.git
		git push -u origin main

		push an existing repository from the command line
		git remote add origin https://github.com/milvaTech/projgiTesting.git
		git branch -M main
		git push -u origin main*/
