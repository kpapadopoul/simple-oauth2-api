package com.example.simpleoauth2api.configuration;

import com.example.simpleoauth2api.model.EmployeeBuilder;
import com.example.simpleoauth2api.model.OrderBuilder;
import com.example.simpleoauth2api.model.OrderStatus;
import com.example.simpleoauth2api.repository.EmployeeRepository;
import com.example.simpleoauth2api.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            employeeRepository.save(
                    EmployeeBuilder.anEmployee().withName("Employee 1").withRole("burglar").build());
            employeeRepository.save(
                    EmployeeBuilder.anEmployee().withName("Employee 2").withRole("thief").build());
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded {}", employee));

            orderRepository.save(
                    OrderBuilder.anOrder().withDescription("MacBook Pro").withStatus(OrderStatus.COMPLETED).build());
            orderRepository.save(
                    OrderBuilder.anOrder().withDescription("iPhone").withStatus(OrderStatus.IN_PROGRESS).build());
            orderRepository.findAll().forEach(order -> log.info("Preloaded {}", order));
        };
    }

}
