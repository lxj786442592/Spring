package com.lxj.www;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Order {
	private int id;			//构造方法注入
	private String orderNum;//构造方法注入
	private double amount;
	private OrderItem orderItem;
	private Date orderDate;//自动装配
	
	private Object[] myArray;
	private List<?> myList;
	private Set<?> mySet;
	private Map<?, ?> myMap;
	private Properties myProp;

	public Order(int id, String orderNum) {
		super();
		this.id = id;
		this.orderNum = orderNum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public Object[] getMyArray() {
		return myArray;
	}

	public void setMyArray(Object[] myArray) {
		this.myArray = myArray;
	}

	public List<?> getMyList() {
		return myList;
	}

	public void setMyList(List<?> myList) {
		this.myList = myList;
	}

	public Set<?> getMySet() {
		return mySet;
	}

	public void setMySet(Set<?> mySet) {
		this.mySet = mySet;
	}

	public Map<?, ?> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<?, ?> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProp() {
		return myProp;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
