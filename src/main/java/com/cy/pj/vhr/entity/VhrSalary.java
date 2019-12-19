package com.cy.pj.vhr.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * 工资条
 */
@Data
@NoArgsConstructor
public class VhrSalary {
	private Integer id;		//工作账套id
	private Integer basicSalary;//基本工资
	private Integer bonus;//奖金
	private Integer lunchSalary;//午餐补助
	private Integer trafficSalary;//交通补助
	private Integer allSalary;//应发工资
	private Integer pensionBase;//养老金基数
	private Double pensionPer;//养老金比率
	private Date createData;//启用时间
	private Integer medicalBase;//医疗基数
	private Double medicalPer;//医疗保险比率
	private Integer accumulationFundBase ;//公积金基数
	private Double accumulationFundPer;//公积金比率
	private String name;//工资账套名称
	public VhrSalary(Integer basicSalary, Integer bonus, Integer lunchSalary, Integer trafficSalary,
			Integer allSalary, Integer pensionBase, Double pensionPer, Integer medicalBase,
			Double medicalPer, Integer accumulationFundBase, Double accumulationFundPer, String name) {
		super();
		this.basicSalary = basicSalary;
		this.bonus = bonus;
		this.lunchSalary = lunchSalary;
		this.trafficSalary = trafficSalary;
		this.allSalary = allSalary;
		this.pensionBase = pensionBase;
		this.pensionPer = pensionPer;
		this.medicalBase = medicalBase;
		this.medicalPer = medicalPer;
		this.accumulationFundBase = accumulationFundBase;
		this.accumulationFundPer = accumulationFundPer;
		this.name = name;
	}
	
}
