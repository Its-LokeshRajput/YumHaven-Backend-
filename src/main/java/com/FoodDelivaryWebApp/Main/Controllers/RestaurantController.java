package com.FoodDelivaryWebApp.Main.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FoodDelivaryWebApp.Main.Entities.Restaurant;
import com.FoodDelivaryWebApp.Main.Services.RestaurantService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantService obj;
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<Restaurant> addRestaurant(@Valid @RequestBody Restaurant restaurant) {
//		System.out.println(restaurant);
		return ResponseEntity.ok(obj.addRestaurant(restaurant));
	}
	
	@GetMapping("/getRestaurantById/{restaurantId}")
	public ResponseEntity<Restaurant> getRestaurantById(@PathVariable(name="restaurantId") int restaurantId) {
		return ResponseEntity.ok(obj.getRestaurantById(restaurantId));
	}
	
	@GetMapping("/getAllRestaurants")
	public ResponseEntity<List<Restaurant>> getAllRestaurant() {
		return ResponseEntity.ok(obj.getAllRestaurants());
	}
	
	@PutMapping("/updateRestaurant")
	public ResponseEntity<Restaurant> updateRestaurant(@Valid @RequestBody Restaurant restaurant) {
		return ResponseEntity.ok(obj.updateRestaurantByNewData(restaurant));
	}
	
	@DeleteMapping("/deleteRestaurant/{restaurantId}")
	public void deleteRestaurantById(@PathVariable(name="restaurantId") int restaurantId) {
		obj.deleteRestaurantById(restaurantId);
	}
}
