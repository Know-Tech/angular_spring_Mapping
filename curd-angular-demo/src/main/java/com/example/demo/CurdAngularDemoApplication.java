package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.repositories.StaffRepository;
import com.example.entity.*;


@SpringBootApplication(scanBasePackages={
		"com.example.repositories", "com.example.entity", "com.example.controllers","com.example.demo"})
@EnableJpaRepositories(basePackageClasses = StaffRepository.class)
public class CurdAngularDemoApplication implements CommandLineRunner{

	@Autowired
	private StaffRepository staffRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CurdAngularDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		staffRepository.save(new Staff("aa","aaa"));
		staffRepository.save(new Staff("bb","bbb"));
		staffRepository.save(new Staff("cc","ccc"));
	}

	
}
