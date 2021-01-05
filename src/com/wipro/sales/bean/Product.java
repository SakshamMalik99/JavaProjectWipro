package com.wipro.sales.bean;

public class Product {
	
	String productID, productName;
	int quantityOnHand, reorderLevel;
	double productUnitPrice;
	/**
	 * @return the productUnitPrice
	 */
	public double getProductUnitPrice() {
		return productUnitPrice;
	}
	/**
	 * @param productUnitPrice the productUnitPrice to set
	 */
	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the quantityOnHand
	 */
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	/**
	 * @param quantityOnHand the quantityOnHand to set
	 */
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	/**
	 * @return the reorderLevel
	 */
	public int getReorderLevel() {
		return reorderLevel;
	}
	/**
	 * @param reorderLevel the reorderLevel to set
	 */
	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	
}
