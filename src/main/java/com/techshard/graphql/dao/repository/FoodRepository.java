package com.techshard.graphql.dao.repository;

import com.techshard.graphql.dao.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository  extends JpaRepository<Food,Integer> {
}
