package com.george.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.george.hrpayroll.entities.Payment;
import com.george.hrpayroll.entities.Worker;
import com.george.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient client;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = this.client.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
