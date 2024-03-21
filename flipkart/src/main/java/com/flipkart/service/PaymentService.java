package com.flipkart.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.flipkart.model.PaymentData;

@Service 
public class PaymentService {
	
	public String makePayment() {

		//success or failed 
		String PaymentStatus="Success"; // Data From Db
		return PaymentStatus;
	}

	public PaymentData getPaymentData(String paymentId) {
		//getting data from repository layer
		//payment is available in db or not
		
		boolean isPaymentIdExists=false;
		if(isPaymentIdExists) {
			PaymentData data= new PaymentData();
			data.setPaymentID("payment123456");
			data.setPayamentStaus("success");
			data.setPaymentDate(LocalDate.now().toString());
			return data;
		}
		else {
			return null;
		}
		
	}

	public String deletePaymentData(String paymentId) {
		boolean isPaymentIdExists=true;
		String result=null;
		if(isPaymentIdExists) {
			return result="Deleted Successfully";
		}
		else {
			return result=null;
		}
	
	}

}
