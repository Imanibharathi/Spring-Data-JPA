package com.goSpring.restdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goSpring.restdemo.model.CloudVendor;
import com.goSpring.restdemo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	CloudVendorService cloudVendorService;
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	@GetMapping()
	public List<CloudVendor> getAllVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String postVendorDetails(@RequestBody CloudVendor cloudvendor) {
		cloudVendorService.createCloudVendor(cloudvendor);
		return "Data posted successfully ";
	}
	
	@PutMapping
	public String putVendorDetails(@RequestBody CloudVendor cloudvendor) {
		cloudVendorService.updateCloudVendor(cloudvendor);
		return "Data updated successfully ";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Data deleted successfully";
	}
	
	
}
