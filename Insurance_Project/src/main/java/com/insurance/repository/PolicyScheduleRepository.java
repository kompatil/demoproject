package com.insurance.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicySchedule;


@Repository
public interface PolicyScheduleRepository extends CrudRepository<PolicySchedule ,Serializable>
{
	public PolicySchedule findById(Integer Id);

}