package com.techshard.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Food;
import com.techshard.graphql.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodQuery implements GraphQLQueryResolver {
    @Autowired
    FoodService foodService;

    public List<Food> getFoods() {
        return foodService.getFoods();
    }

    public Food getFood(Integer id) {
        return foodService.getFood(id);
    }


}
