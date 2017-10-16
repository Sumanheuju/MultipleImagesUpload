package com.vortexnepal.ghyampo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vortexnepal.ghyampo.controller.admin.ProductController;


@SpringBootApplication
public class ApplicationStarter {
	public static void main(String[] args){
		new File(ProductController.uploadingdir).mkdirs();
		SpringApplication.run(ApplicationStarter.class, args);
	}
}
