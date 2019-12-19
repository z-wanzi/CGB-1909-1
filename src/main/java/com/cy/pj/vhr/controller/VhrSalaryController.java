package com.cy.pj.vhr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.pj.vhr.entity.VhrSalary;
import com.cy.pj.vhr.service.VhrSalaryService;

@Controller
@RequestMapping("/")
public class VhrSalaryController {
	@Autowired
	VhrSalaryService vhrSalaryService;
	@RequestMapping("doSalaryInsert")
	public void salaryInsert() {
		VhrSalary vhrSalary = new VhrSalary(222, 111, 222, 
				222, 3333,111,
				0.1, 222, 
				0.1, 333, 0.333, "测试仪");
		vhrSalaryService.salaryInsert(vhrSalary);
	}
}
