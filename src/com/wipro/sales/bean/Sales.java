package com.wipro.sales.bean;

public class Sales {
	String salesID, productID;
	int quantitySold;
	double salesPricePerUnit;
	java.util.Date salesDate;
	/**
	 * @return the salesID
	 */
	public String getSalesID() {
		return salesID;
	}
	/**
	 * @param salesID the salesID to set
	 */
	public void setSalesID(String salesID) {
		this.salesID = salesID;
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
	 * @return the quantitySold
	 */
	public int getQuantitySold() {
		return quantitySold;
	}
	/**
	 * @param quantitySold the quantitySold to set
	 */
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	/**
	 * @return the salesPricePerUnit
	 */
	public double getSalesPricePerUnit() {
		return salesPricePerUnit;
	}
	/**
	 * @param salesPricePerUnit the salesPricePerUnit to set
	 */
	public void setSalesPricePerUnit(double salesPricePerUnit) {
		this.salesPricePerUnit = salesPricePerUnit;
	}
	/**
	 * @return the salesDate
	 */
	public java.util.Date getSalesDate() {
		return salesDate;
	}
	/**
	 * @param salesDate the salesDate to set
	 */
	public void setSalesDate(java.util.Date salesDate) {
		this.salesDate = salesDate;
	}
	
}
