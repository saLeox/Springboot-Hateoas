package com.project.entity.maidService;

import java.util.Date;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class MaidServiceSubscription extends RepresentationModel<MaidServiceSubscription>   {

	private Integer id;
	private List<MaidServiceSubscriptionItem> subscriptionItems;
	private Integer customerID;
	private Integer agencyID;
	private double price;
	private Date createTime;
	private Date modifyTime;

	public Integer getId() {
		return id;
	}
	public List<MaidServiceSubscriptionItem> getSubscriptionItems() {
		return subscriptionItems;
	}
	public Integer getCustomerID() {
		return customerID;
	}
	public Integer getAgencyID() {
		return agencyID;
	}
	public double getPrice() {
		return price;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSubscriptionItems(List<MaidServiceSubscriptionItem> subscriptionItems) {
		this.subscriptionItems = subscriptionItems;
	}
	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}
	public void setAgencyID(Integer agencyID) {
		this.agencyID = agencyID;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}
