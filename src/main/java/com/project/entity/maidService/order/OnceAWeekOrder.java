package com.project.entity.maidService.order;

import com.project.entity.TimeUnitEnum;

public class OnceAWeekOrder extends PlanOrder  {

	public OnceAWeekOrder() {
		super();
		super.setId(3);
		super.setTimeUnit(TimeUnitEnum.Week);
		super.setType(MaidServiceOrderConstant.OnceAWeek);
		super.setServiceTimes(1);
		super.setTotalPrice(67);
	}

}
