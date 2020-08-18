package com.asm.tracker.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.asm.tracker.entity.ApiHitDetails;
import com.asm.tracker.repository.ApiRepository;

@Service
public class ApiHitService {

	@Autowired
	ApiRepository apiRepository;

	@Value("${hitCountPerDay}")
	private int hitCountPerDay;

	@Value("${hitCountPerMonth}")
	private int hitCountPerMonth;

	public boolean shouldProessRequestForDay(String apiKey, String apiUrl) {
		int hitCountPerDayFromDB = apiRepository.findAllByApiKeyAndApiUrlAndDate(apiKey, apiUrl);
		if (hitCountPerDayFromDB <= hitCountPerDay)
			return true;
		return false;

	}

	public boolean shouldProessRequestForMonth(String apiKey, String apiUrl) {
		int hitCountPerMonthFromDB = apiRepository.findAllByApiKeyAndApiUrlAndMonth(apiKey, apiUrl);
		if (hitCountPerMonthFromDB <= hitCountPerMonth)
			return true;
		return false;

	}

	public ApiHitDetails saveApiHitDetails(String apiKey, String apiUrl) {
		ApiHitDetails apiHitDetails = new ApiHitDetails();
		apiHitDetails.setApiKey(apiKey);
		apiHitDetails.setApiUrl(apiUrl);
		apiHitDetails.setHitDate(new Date());
		return apiRepository.save(apiHitDetails);
	}

	public List<ApiHitDetails> getMonthReport() {
		return apiRepository.findAllByMonth();
	}

}
