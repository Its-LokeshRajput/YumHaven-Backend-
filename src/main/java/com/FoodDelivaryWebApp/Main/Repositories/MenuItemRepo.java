package com.FoodDelivaryWebApp.Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FoodDelivaryWebApp.Main.Entities.MenuItem;

@Repository
public interface MenuItemRepo extends JpaRepository<MenuItem, Integer>{

}
