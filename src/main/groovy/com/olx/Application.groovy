package com.olx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan('com.olx')
class Application {

	static void main(String[] args) {
		SpringApplication.run Application, args
	}
}
