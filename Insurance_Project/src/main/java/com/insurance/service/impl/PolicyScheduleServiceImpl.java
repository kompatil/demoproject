package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicySchedule;
import com.insurance.repository.PolicyScheduleRepository;
import com.insurance.services.PolicyScheduleService;

@Service
public class PolicyScheduleServiceImpl  implements PolicyScheduleService {

	 @Autowired
	 private PolicyScheduleRepository policyschedulerepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policyschedule)
	{
	  PolicySchedule policydetails=policyschedulerepository.save(policyschedule);
		return policydetails;
	}

	@Override
	public PolicySchedule updatePolicySchedule(PolicySchedule policyschedule) {
		PolicySchedule updatedetails=policyschedulerepository.save(policyschedule);
		return updatedetails;
	}

	@Override
	public PolicySchedule getPolicyScheduleById(Integer Id) {
		PolicySchedule getpolicy =policyschedulerepository.findById(Id);
		return getpolicy;
	}

	@Override
	public void deletePolicySchedule(Integer id) {
		policyschedulerepository.deleteById(id);
	}

}
