package com.project.entity.maidService.order;

import com.project.entity.maidService.MaidServiceOrder;

public class PlanOrder extends MaidServiceOrder {

	public PlanOrder() {
		super();
		this.singleServiceHours = 7;
	}

	private Integer serviceTimes;
	private double totalPrice;
	private double singleServiceHours;

	public Integer getServiceTimes() {
		return serviceTimes;
	}


	protected void setServiceTimes(Integer serviceTimes) {
		this.serviceTimes = serviceTimes;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	protected void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public double getSingleServiceHours() {
		return singleServiceHours;
	}


	protected void setSingleServiceHours(double singleServiceHours) {
		this.singleServiceHours = singleServiceHours;
	}

}
