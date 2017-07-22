package com.sethborne.assignmentone.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentone.driverslicense.models.License;

@Repository

public interface LicenseRepository extends CrudRepository<License, Long>{

}
