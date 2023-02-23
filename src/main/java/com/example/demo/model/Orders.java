package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Orders")
public class Orders {
	@Id
	private String orderId;
	private String orderName;
	private String orderQty;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", orderQty=" + orderQty + "]";
	}	

}
