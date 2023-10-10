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
	 private PolicyScheduleRepository policyscheduleRepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policyschedule)
	{
	  PolicySchedule policydetails=policyscheduleRepository.save(policyschedule);
		return policydetails;
	}

	@Override
	public PolicySchedule updatePolicySchedule(PolicySchedule policyschedule) {
		PolicySchedule updatedetails=policyscheduleRepository.save(policyschedule);
		return updatedetails;
	}

	@Override
	public PolicySchedule getPolicyScheduleById(Integer Id) {
		PolicySchedule getpolicy =policyscheduleRepository.findById(Id);
		return getpolicy;
	}

}
