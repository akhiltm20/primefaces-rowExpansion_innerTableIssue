package org.primefaces.test;

public class LineVO {

	String productDescription;
	String quantity;
	String price;
	String DeliveryDate;
	String DeliveryPoint;
	
	
	
	public LineVO(String productDescription, String quantity, String price, String deliveryDate, String deliveryPoint) {
		super();
		this.productDescription = productDescription;
		this.quantity = quantity;
		this.price = price;
		DeliveryDate = deliveryDate;
		DeliveryPoint = deliveryPoint;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public String getDeliveryPoint() {
		return DeliveryPoint;
	}
	public void setDeliveryPoint(String deliveryPoint) {
		DeliveryPoint = deliveryPoint;
	}
	
}
