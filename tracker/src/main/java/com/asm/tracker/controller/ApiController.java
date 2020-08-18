package com.asm.tracker.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asm.tracker.entity.ApiHitDetails;
import com.asm.tracker.service.ApiHitService;

@Controller
public class ApiController {

	@Autowired
	ApiHitService service;

	@GetMapping("/getMonthReport")
	public ModelAndView getMonthReport() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showMonthlyReport");
		List<ApiHitDetails> list = service.getMonthReport();
		mav.addObject("list", list);
		mav.addObject("currMonth", LocalDate.now().getMonth());
		return mav;

	}

}
