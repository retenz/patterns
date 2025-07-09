package com.example.patterns;

import com.example.patterns.builder.builders.PizzaBuilder;
import com.example.patterns.builder.domain.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

//		3. Паттерн builder
//		Из интересного: можно создать билдер отдельным публичным классом, а можно вложенным статическим внутри нашего Product (в данном случае pizza)
		Pizza pizza = new PizzaBuilder()
				.addCheese("голубой сыр")
				.addMushroom("белый гриб")
				.addTomato("помидорчик")
				.build();
		System.out.println(pizza.toString());

		Pizza staticPizza = new Pizza.PizzaBuilder()
				.addCheese("голубой сыр")
				.addMushroom("белый гриб")
				.addTomato("помидорчик")
				.build();

		System.out.println(staticPizza);

	}

}
