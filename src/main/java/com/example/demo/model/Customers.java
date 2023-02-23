package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customers {
	@Id
	private String cId;
	private String	cName;
	private String	cMail;
	private String	cPhone;
	
	
	//@OneToMany(targetEntity=Orders.class)
	//@ElementCollection(targetClass=Orders.class)

	@OneToMany(targetEntity = Orders.class,cascade= CascadeType.ALL)
    @JoinColumn(name = "cp_fk",referencedColumnName ="cId")
	private List<Orders> orders;
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcMail() {
		return cMail;
	}
	public void setcMail(String cMail) {
		this.cMail = cMail;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customers [cId=" + cId + ", cName=" + cName + ", cMail=" + cMail + ", cPhone=" + cPhone + ", orders="
				+ orders + "]";
	}
	public Customers(String cId, String cName, String cMail, String cPhone, List<Orders> orders) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cMail = cMail;
		this.cPhone = cPhone;
		this.orders = orders;
	}
	public Customers() {

	}
	
}
