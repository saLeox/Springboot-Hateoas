package com.project.entity.maidService.order;

import com.project.entity.TimeUnitEnum;
import com.project.entity.maidService.MaidServiceOrder;

public class OneTimeAdHocOrder extends MaidServiceOrder {

	private double unitPrice;

	public OneTimeAdHocOrder() {
		super();
		super.setId(1);
		super.setTimeUnit(TimeUnitEnum.Hour);
		super.setType(MaidServiceOrderConstant.OneTimeAdHoc);
		this.unitPrice = 10;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	protected void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
