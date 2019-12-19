package com.cy.pj.vhr.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.vhr.entity.VhrSalary;

@Mapper
public interface VhrSalaryDao {
	/**
	  * 向数据库插入工资账套
	 * @param basicSalary	基本工资
	 * @param bonus			奖金
	 * @param lunchSalary	午餐补助
	 * @param trafficSalary	交通补助
	 * @param allSalary		应发工资
	 * @param pensionBase	养老基金数
	 * @param pensionPer	养老金比率
	 * @param medicalBase	医疗基数
	 * @param medicalPer	医疗保险比率
	 * @param accumulationFundBase	公积金基数
	 * @param accumulationFundPer	公积金比率
	 * @param name			工资账套名称
	 * @return
	 */
	void salaryInsert(VhrSalary vhrSalary);
}
