package com.insurance.services;

import com.insurance.model.PolicySchedule;

public interface PolicyScheduleService
{
	public PolicySchedule  savePolicySchedule (PolicySchedule policyschedule );
	
	public PolicySchedule updatePolicySchedule(PolicySchedule policyschedule);
	
	public PolicySchedule getPolicyScheduleById(Integer Id);
	
	public void deletePolicySchedule(Integer id);
}
