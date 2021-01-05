package com.wipro.sales.bean;

public class SalesReport {
	
	String salesID, productID, productName;
	double productUnitPrice, salesPricePerUnit, profitAmount;
	int quantitySold;
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
	 * @return the profitAmount
	 */
	public double getProfitAmount() {
		return profitAmount;
	}
	/**
	 * @param profitAmount the profitAmount to set
	 */
	public void setProfitAmount(double profitAmount) {
		this.profitAmount = profitAmount;
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
