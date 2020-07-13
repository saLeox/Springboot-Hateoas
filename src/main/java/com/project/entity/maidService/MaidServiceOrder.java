package com.project.entity.maidService;

import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import com.project.entity.TimeUnitEnum;
import com.project.entity.maidService.order.MaidServiceOrderConstant;
import com.project.entity.maidService.order.OnceAFortnightOrder;
import com.project.entity.maidService.order.OnceAWeekOrder;
import com.project.entity.maidService.order.OneTimeAdHocOrder;
import com.project.entity.maidService.order.TwiceAWeekOrder;

public class MaidServiceOrder extends RepresentationModel<MaidServiceOrder>  {

	private Integer id;
	private String type;
	private String description;
	private Date efftDate;
	private Date expiryDate;
	private TimeUnitEnum timeUnit;

	static public MaidServiceOrder factoryCreate(String type) {
		switch (type) {
		case MaidServiceOrderConstant.OneTimeAdHoc:
			OneTimeAdHocOrder oneTimeAdHoc = new OneTimeAdHocOrder();
			return oneTimeAdHoc;
		case MaidServiceOrderConstant.OnceAFortnight:
			OnceAFortnightOrder onceAFortnight = new OnceAFortnightOrder();
			return onceAFortnight;
		case MaidServiceOrderConstant.OnceAWeek:
			OnceAWeekOrder onceAWeek = new OnceAWeekOrder();
			return onceAWeek;
		case MaidServiceOrderConstant.TwiceAWeek:
			TwiceAWeekOrder twiceAWeek = new TwiceAWeekOrder();
			return twiceAWeek;
		default:
			return null;
		}
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	public Date getEfftDate() {
		return efftDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
	protected void setEfftDate(Date efftDate) {
		this.efftDate = efftDate;
	}
	protected void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	protected TimeUnitEnum getTimeUnit() {
		return timeUnit;
	}
	protected void setTimeUnit(TimeUnitEnum timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}


}
