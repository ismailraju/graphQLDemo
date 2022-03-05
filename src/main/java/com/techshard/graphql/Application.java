package com.techshard.graphql;

import com.techshard.graphql.dao.entity.Food;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.dao.repository.FoodRepository;
import com.techshard.graphql.dao.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    FoodRepository foodRepository;

    @Override
    public void run(String... args) throws Exception {
        Vehicle s = new Vehicle(
                1,
                "car",
                "007",
                "Hundai",
               LocalDate.now(),
               LocalDate.now().toString()
        );
        vehicleRepository.save(s);

        foodRepository.save(new Food(1,"kola", (float) 1.0));
        foodRepository.save(new Food(2,"avocado", (float) 10.0));
    }
}
