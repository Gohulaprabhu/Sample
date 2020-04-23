package com.mindtree.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.Repository.BillRepo;
import com.mindtree.Repository.MenuRepo;
import com.mindtree.model.Bill;
import com.mindtree.util.Mail;

@Component
public class Business {

	@Autowired
	BillRepo billRepo;
	@Autowired
	Mail mail;
	@Autowired
	MenuRepo menuRepo;
	
	static int total_cost;
	public String createBill(Bill bill) {
		String msg=Business.convertToHtml(bill);
		bill.setTotal_cost(total_cost);
		menuRepo.saveAll(bill.getMenu());
		billRepo.save(bill);
		mail.sendMail(bill.getUser_email(),"Online Table Reservation System",msg);
		return "success";
	}
	public static String convertToHtml(Bill bill) {
		return (
				"<html>\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"utf-8\" />\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <h1>Thanks For Booking</h1>\r\n" + 
				"    <h2>"+bill.getRes_name()+"</h2>\r\n" + 
				"<h3>Your Booking id :"+bill.getBook_id()+"</h3>"+
				"<table>"+getMenu(bill)+"</table>"+
				"<p>*Total cost is inclusive of Service Charge</p>"+
				"</body>\r\n" + 
				"</html>");
	}
	public static String getMenu(Bill bill) {
		String t="<tr><th>Item Name</th><th>Cost</th></tr>";
		int cost=0;
		for(int i=0;i<bill.getMenu().size();i++) {
			t+="<tr><td>"+bill.getMenu().get(i).getItem()+"</td><td></td>"+bill.getMenu().get(i).getCost()+"</td></tr>";
			cost+=bill.getMenu().get(i).getCost();
		}
		cost+=bill.getRes_cost();
		total_cost=cost;
		t+="<tr><td>Total Cost</td><td></td>"+cost+"</td></tr>";
		return t;
		
	}

}
