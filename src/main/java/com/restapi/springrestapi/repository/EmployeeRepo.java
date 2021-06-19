package com.restapi.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
