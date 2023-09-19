package com.goSpring.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goSpring.restdemo.model.CloudVendor;
import com.goSpring.restdemo.repository.CloudVendorRepo;
import com.goSpring.restdemo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepo cloudVendorRepo;
	
	public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
		super();
		this.cloudVendorRepo = cloudVendorRepo;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudvendor) {
		cloudVendorRepo.save(cloudvendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudvendor) {
		cloudVendorRepo.save(cloudvendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepo.deleteById(vendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) {
		return cloudVendorRepo.findById(vendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		
		return cloudVendorRepo.findAll();
	}

}
