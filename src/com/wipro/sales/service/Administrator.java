package com.wipro.sales.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.wipro.sales.bean.Product;
import com.wipro.sales.dao.*;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.dao.StockDao;
import com.wipro.sales.util.DBUtil;

public class Administrator {
	
	Connection conn = DBUtil.getDBConnection();
	public String insertStock(Product product) throws SQLException {
		String pid = null;
		if(product!=null&&product.getProductName().length()>=2)
		{
			pid = StockDao.generateProductID(product.getProductName());
			product.setProductID(pid);
			
		if(StockDao.insertStock(product) == 1) {
			System.out.println("Inserted Successfully");
		}
		else
			System.out.println("Error in Insertion");
		}
		else
			return "Data not valid for insertion";
		
		return product.getProductID();
	}
	
	public String deleteStock(String productID) throws SQLException
	{
		if(StockDao.deleteStock(productID)==1)
			return "Deleted";
		else
			return "Record cannot be Deleted";
	}
	
	public String insertSales(Sales sale) throws SQLException
	{
		int qty = 0;
		if(sale==null)
			return "Object not valid for insertion";
		if(sale.getProductID().length()!=6)
			return "Unknown Product for Sales";
		
		PreparedStatement ps = conn.prepareStatement("Select QUANTITY_ON_HAND from TBL_STOCK where PRODUCT_ID = ?");
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			qty = rs.getInt(1);
			
		if(qty<sale.getQuantitySold())
			return "Not enough stock on hand for sale";
		
		Date date = sale.getSalesDate();
		Date curdate = new Date(new java.util.Date().getTime());
		
		if(date.compareTo(curdate)>0)
			return "Invalid Date";
		
		sale.setSalesID(SalesDao.generateSalesID(date));
		
		if(SalesDao.insertSales(sale) == -1)
			return "Error in the Sales insertion";
		
		if(StockDao.updateStock(sale.getProductID(), sale.getQuantitySold()) == -1)
			return "Error in Stock Updation";
		
		return "Sales Completed";
		
	}
	
	public static ArrayList<SalesReport> getSalesReport()
	{	
		return(SalesDao.getSalesReport());
	}

}
