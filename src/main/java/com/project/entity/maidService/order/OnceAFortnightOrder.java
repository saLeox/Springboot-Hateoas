package com.project.entity.maidService.order;

import com.project.entity.TimeUnitEnum;

public class OnceAFortnightOrder extends PlanOrder {

	public OnceAFortnightOrder() {
		super();
		super.setId(2);
		super.setTimeUnit(TimeUnitEnum.Fortnight);
		super.setType(MaidServiceOrderConstant.OnceAFortnight);
		super.setServiceTimes(1);
		super.setTotalPrice(65);
	}

}
