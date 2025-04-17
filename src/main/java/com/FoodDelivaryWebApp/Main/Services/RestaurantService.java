package com.FoodDelivaryWebApp.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodDelivaryWebApp.Main.Entities.Restaurant;
import com.FoodDelivaryWebApp.Main.Repositories.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo obj;
	
	public Restaurant addRestaurant(Restaurant restaurant) {
		return obj.save(restaurant);
	}
	
	public Restaurant getRestaurantById(int restaurantId) {
		return obj.findById(restaurantId).orElse(null);
	}
	
	public List<Restaurant> getAllRestaurants() {
		return obj.findAll();
	}
	
	public void deleteRestaurantById(int restaurantId) {
		obj.deleteById(restaurantId);
	}
	
	public Restaurant updateRestaurantByNewData(Restaurant restaurant) {
		return obj.save(restaurant);
	}
}
