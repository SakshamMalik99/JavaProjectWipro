package com.wipro.sales.dao;

import com.wipro.sales.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;

public class SalesDao {
	
	static Connection conn = DBUtil.getDBConnection();
	public static int insertSales(Sales sales) {
		
		//get values to be inserted
		String SalesID = sales.getSalesID();
		java.util.Date SalesDate = sales.getSalesDate();
		String ProductId = sales.getProductID();
		int QuantitySold = sales.getQuantitySold();
		double salesPricePerUnit = sales.getSalesPricePerUnit();
	
		
		//get connection from DBUtill.java
		try {
			Statement st = conn.createStatement();
			String sql = "Insert into TBL_SALES values('"+SalesID+"','"+SalesDate+"','"+ProductId+"','"+QuantitySold+"','"+salesPricePerUnit+"')";
			if(st.execute(sql))
				return 0;
			else
				return -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database Update failed at SalesDao.java");
			e.printStackTrace();
			return -1;
		}
	}
	
	public static String generateSalesID(java.util.Date salesDate) {
		
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select SEQ_SALES_ID.nextval from dual");
			ResultSet rs = ps.executeQuery();
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(salesDate);
			int year = cal.get(Calendar.YEAR);
			
			if(rs.next()) {
				return ""+(year%100)+rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";	
	}
	
	public static ArrayList<SalesReport> getSalesReport(){
		
		ArrayList<SalesReport> list = new ArrayList<SalesReport>();
		
		try {
			PreparedStatement ps = conn.prepareStatement("Select * from V_SALES_REPORT");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				SalesReport sp = new SalesReport();
				
				sp.setSalesID(rs.getString(1));
				sp.setSalesDate(rs.getDate(2));
				sp.setQuantitySold(rs.getInt(3));
				sp.setProductUnitPrice(rs.getDouble(6));
				sp.setSalesPricePerUnit(rs.getDouble(7));
				sp.setProfitAmount(rs.getDouble(8));
				
				list.add(sp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;	
	}
	
}
