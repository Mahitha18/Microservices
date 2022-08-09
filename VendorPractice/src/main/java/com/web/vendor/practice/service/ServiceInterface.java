package com.web.vendor.practice.service;

import java.util.List;


import com.web.vendor.practice.dao.entity.VentorEntity;

public interface ServiceInterface {
	VentorEntity saveVendor(VentorEntity vendor);
	VentorEntity updateVendor(VentorEntity vendor);
	void deleteVendor(VentorEntity vendor);
	VentorEntity getVendorById(int id);
	List<VentorEntity> getAllVendors();
	
	
	
}
