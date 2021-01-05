package com.wipro.sales.main;

import com.wipro.sales.bean.Product;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.service.Administrator;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SalesApplication {

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		Administrator a = new Administrator();
		
		System.out.println("Hello User!, Welcome to Stock Invertory System");
		while(input!=-1){
		System.out.println("Please select your choice for action you want to perform...");
		System.out.println("Press 1 to INSERT STOCK");
		System.out.println("Press 2 to DELETE STOCK");
		System.out.println("Press 3 to INSERT SALES");
		System.out.println("Press 4 to VIEW SALES REPORT");
		System.out.println("Press -1 to EXIT");

		input = sc.nextInt();
		
			switch (input) {
			case 1: {
				Product p = new Product();
				System.out.println("Enter ProductID");
				p.setProductID(sc.next());
				System.out.println("Enter ProductName");
				p.setProductName(sc.next());
				System.out.println("Enter Quantity On Hand");
				p.setQuantityOnHand(sc.nextInt());
				System.out.println("Enter Product Unit Price");
				p.setProductUnitPrice(sc.nextDouble());
				System.out.println("Enter Reorder Level");
				p.setReorderLevel(sc.nextInt());
				
				a.insertStock(p);
			}
			break;
			case 2:{
				a.deleteStock(sc.next());
			}
			break;
			case 3:{
				Sales s = new Sales();
				
				s.setSalesID(sc.next());
				
				String inputDate=sc.next();
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
				java.util.Date utildate = sdf1.parse(inputDate);
				java.sql.Date date = new java.sql.Date(utildate.getTime());
				s.setSalesDate(date);
				
				s.setProductID(sc.next());
				s.setQuantitySold(sc.nextInt());
				s.setSalesPricePerUnit(sc.nextDouble());
				
				a.insertSales(s);
			}
			break;
			case 4:{
				Administrator.getSalesReport();
			}
			break;
			default:
				System.out.println("Thank You, Current session has been exited. Fuck off lil dick");
			}
		}
		sc.close();
	}

}
