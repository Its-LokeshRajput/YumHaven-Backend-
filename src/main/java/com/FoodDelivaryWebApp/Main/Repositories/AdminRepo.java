package com.FoodDelivaryWebApp.Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FoodDelivaryWebApp.Main.Entities.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
