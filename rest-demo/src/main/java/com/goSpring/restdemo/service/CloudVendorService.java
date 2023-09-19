package com.goSpring.restdemo.service;

import java.util.List;

import com.goSpring.restdemo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudvendor);
	public String updateCloudVendor(CloudVendor cloudvendor);
	public String deleteCloudVendor(String vendorId);
	public CloudVendor getCloudVendor(String vendorId);
	public List<CloudVendor> getAllCloudVendors();

}
