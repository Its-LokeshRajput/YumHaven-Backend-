package com.FoodDelivaryWebApp.Main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodDelivaryWebApp.Main.Entities.Admin;
import com.FoodDelivaryWebApp.Main.Repositories.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo obj;
	
	public Admin addAdmin(Admin admin) {
		return obj.save(admin);
	}
	
	public Admin getAdminById(int adminId) {
		return obj.findById(adminId).orElse(null);
	}
	
	public List<Admin> getAllAdmins() {
		return obj.findAll();
	}
	
	public void deleteAdminById(int adminId) {
		obj.deleteById(adminId);
	}
	
	public Admin updateAdminByNewData(Admin admin) {
		return obj.save(admin);
	}
}
