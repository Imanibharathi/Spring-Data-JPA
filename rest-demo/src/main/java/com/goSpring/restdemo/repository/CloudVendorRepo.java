package com.goSpring.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goSpring.restdemo.model.CloudVendor;

public interface CloudVendorRepo extends JpaRepository<CloudVendor, String> {

}
