package com.FoodDelivaryWebApp.Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FoodDelivaryWebApp.Main.Entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
