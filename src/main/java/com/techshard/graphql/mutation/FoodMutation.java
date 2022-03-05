package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Food;
import com.techshard.graphql.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodMutation implements GraphQLMutationResolver {

    @Autowired
    FoodService foodService;


    public Food createFood(Integer id, String name, Float price) {

        return foodService.createFood(id, name, price);
    }
}
