package com.cy.pj.vhr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.vhr.dao.VhrSalaryDao;
import com.cy.pj.vhr.entity.VhrSalary;
import com.cy.pj.vhr.service.VhrSalaryService;

@Service
public class VhrSalaryServiceImpl implements VhrSalaryService {
	@Autowired
	private VhrSalaryDao vhrSalaryDao;
	//向数据库中添加工资账套
	@Override
	public void salaryInsert(VhrSalary vhrSalary) {
		vhrSalaryDao.salaryInsert(vhrSalary);
	}
}
