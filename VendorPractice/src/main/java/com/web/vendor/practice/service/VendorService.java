package com.web.vendor.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.vendor.practice.dao.entity.VentorEntity;
import com.web.vendor.practice.dao.repo.DaoRepository;
@Service
public class VendorService  implements ServiceInterface{
	@Autowired
	private DaoRepository repository;
	public VentorEntity saveVendor(VentorEntity vendor) {
		return repository.save(vendor);
		
	}
	public VentorEntity updateVendor(VentorEntity vendor) {
		
		return repository.save(vendor);
		
	}
	@Override
	public void deleteVendor(VentorEntity vendor) {
		// TODO Auto-generated method stub
		repository.delete(vendor);
		
	}
	@Override
	public VentorEntity getVendorById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).get();
	}
	@Override
	public List<VentorEntity> getAllVendors() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}
	
	

}
