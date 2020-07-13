package com.project.entity.maidService;

public class MaidServiceSubscriptionItem {

    private Integer id;
    private MaidServiceOrder maidOrder;
    private int num;

	public MaidServiceOrder getMaidOrder() {
		return maidOrder;
	}
	public int getNum() {
		return num;
	}

	public void setMaidOrder(MaidServiceOrder maidOrder) {
		this.maidOrder = maidOrder;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
