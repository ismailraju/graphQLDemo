package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.Food;
import com.techshard.graphql.dao.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    @Autowired
    FoodRepository foodRepository;

    public List<Food> getFoods() {
        return foodRepository.findAll();
    }


    public Food getFood(Integer id) {
        Optional<Food> byId = foodRepository.findById(id);
        return byId.isPresent() ? byId.get() : null;
    }

    public Food createFood(Integer id, String name, Float price) {
        return foodRepository.save(new Food(id, name, price));
    }
}
