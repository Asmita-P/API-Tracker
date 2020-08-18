package com.asm.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.asm.tracker.entity.ApiHitDetails;
import com.asm.tracker.service.ApiHitService;

@RestController
public class ApiRestController {

	@Autowired
	ApiHitService service;

	@GetMapping("/apitest1/{apiKey}")
	public String apitest1(@PathVariable String apiKey) {
		String apiUrl = "apitest1";
		if (service.shouldProessRequestForDay(apiKey, apiUrl) && service.shouldProessRequestForMonth(apiKey, apiUrl)) {

			return service.saveApiHitDetails(apiKey, apiUrl).toString();

		}

		return "Hit Limit Crossed!";

	}

	@GetMapping("/apitest2/{apiKey}")
	public String apitest2(@PathVariable String apiKey) {
		String apiUrl = "apitest2";
		if (service.shouldProessRequestForDay(apiKey, apiUrl) && service.shouldProessRequestForMonth(apiKey, apiUrl)) {

			return service.saveApiHitDetails(apiKey, apiUrl).toString();

		}

		return "Hit Limit Crossed!";

	}

	@GetMapping("/apitest3/{apiKey}")
	public String apitest3(@PathVariable String apiKey) {
		String apiUrl = "apitest3";
		if (service.shouldProessRequestForDay(apiKey, apiUrl) && service.shouldProessRequestForMonth(apiKey, apiUrl)) {

			return service.saveApiHitDetails(apiKey, apiUrl).toString();

		}

		return "Hit Limit Crossed!";

	}

	@GetMapping("/apitest4/{apiKey}")
	public String apitest4(@PathVariable String apiKey) {
		String apiUrl = "apitest4";
		if (service.shouldProessRequestForDay(apiKey, apiUrl) && service.shouldProessRequestForMonth(apiKey, apiUrl)) {

			return service.saveApiHitDetails(apiKey, apiUrl).toString();

		}

		return "Hit Limit Crossed!";

	}

	@GetMapping("/apitest5/{apiKey}")
	public String apitest5(@PathVariable String apiKey) {
		String apiUrl = "apitest5";
		if (service.shouldProessRequestForDay(apiKey, apiUrl) && service.shouldProessRequestForMonth(apiKey, apiUrl)) {

			return service.saveApiHitDetails(apiKey, apiUrl).toString();

		}

		return "Hit Limit Crossed!";

	}

}
