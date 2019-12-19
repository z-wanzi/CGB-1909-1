package com.cy.pj.vhr.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.vhr.dao.VhrSalaryDao;
import com.cy.pj.vhr.entity.VhrSalary;

@SpringBootTest
public class SalaryInsertTest {
	@Autowired
	VhrSalaryDao vhrSalaryDao;
	@Test
	public void testSalary() {
		VhrSalary vhrSalary = new VhrSalary(111, 111, 222, 
				222, 3333,111,
				0.1, 222, 
				0.1, 333, 0.333, "测试仪");
		vhrSalaryDao.salaryInsert(vhrSalary);
	}
}
