package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicySchedule;
import com.insurance.services.PolicyScheduleService;
//import com.insurance.services.UserService;

@RestController
public class PolicyScheduleController
{
	@Autowired
	private PolicyScheduleService policyscheduleservice;
	@PostMapping("savepolicyschedule")
	public PolicySchedule  savePolicySchedule (@RequestBody PolicySchedule policyschedule )
	{
		PolicySchedule policy1=policyscheduleservice.savePolicySchedule(policyschedule);
		return policy1;

	}
	
	@PutMapping("/updatePolicySchedule")
	public PolicySchedule updatePolicySchedule(@RequestBody PolicySchedule policyschedule)
	{
		PolicySchedule policy2=policyscheduleservice.savePolicySchedule(policyschedule);
		return policy2;
		
	}
	@GetMapping("/getPolicySchedule/{id}")
	public PolicySchedule getPolicyScheduleById(@PathVariable("id") Integer Id)
	{
		PolicySchedule policy3=policyscheduleservice.getPolicyScheduleById(Id);
		return policy3;
		
	}
	@DeleteMapping("/deletePolicySchedule/{id}")
	public void deletePolicySchedule(@PathVariable("id") Integer id)throws Exception
	{
		 policyscheduleservice.deletePolicySchedule(id);
	}
}
