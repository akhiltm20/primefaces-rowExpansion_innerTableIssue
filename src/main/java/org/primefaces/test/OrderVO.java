package org.primefaces.test;

import java.util.List;

public class OrderVO {
	
	
	private String orderNo;
	private String addressLine1;
    private long totalAmt;

	private List<LineVO> lineItems;
	
	
	
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public long getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(long totalAmt) {
		this.totalAmt = totalAmt;
	}

	public void setLineItems(List<LineVO> lineItems) {
		this.lineItems = lineItems;
	}
	
	public List<LineVO> getLineItems() {
		return lineItems;
	}
}
