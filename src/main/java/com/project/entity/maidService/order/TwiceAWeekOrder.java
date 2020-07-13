package com.project.entity.maidService.order;

import com.project.entity.TimeUnitEnum;

public class TwiceAWeekOrder extends PlanOrder {

	public TwiceAWeekOrder() {
		super();
		super.setId(4);
		super.setTimeUnit(TimeUnitEnum.Week);
		super.setType(MaidServiceOrderConstant.TwiceAWeek);
		super.setServiceTimes(2);
		super.setTotalPrice(130);
	}

}
