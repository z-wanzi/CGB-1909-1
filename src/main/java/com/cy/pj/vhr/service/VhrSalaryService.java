package com.cy.pj.vhr.service;

import com.cy.pj.vhr.entity.VhrSalary;

public interface VhrSalaryService {
	//向数据库中插入工资账套
	void salaryInsert(VhrSalary vhrSalary);
}
