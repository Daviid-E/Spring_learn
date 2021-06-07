package com.zeedlabs.topupbox.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zeedlabs.topupbox.entities.Payment;
import com.zeedlabs.topupbox.models.BaseResponse;
import com.zeedlabs.topupbox.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	
	@RequestMapping(value="/add-payment",method=RequestMethod.POST)
	public ResponseEntity savePayment(@RequestBody Payment payment) {
		BaseResponse baseResponse= paymentService.savePaymentRecord(payment);
		return new ResponseEntity<>(baseResponse,HttpStatus.OK);
	}
	
	@RequestMapping(value="/get-payment",method=RequestMethod.GET)
	public ResponseEntity getPaymentById(@RequestParam("paymentId") String paymentId ) {
		BaseResponse baseResponse= paymentService.retrievedRecordById(paymentId);
		return new ResponseEntity<>(baseResponse,HttpStatus.OK);
	}
	@RequestMapping(value="/get-allPayments",method=RequestMethod.GET)
	public ResponseEntity getallPaymentId() {
		BaseResponse baseResponse= paymentService.retrieveAllRecordById();
		return new ResponseEntity<>(baseResponse,HttpStatus.OK);
	}
	@RequestMapping(value="/delete-a-payment/{id}", method=RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
         paymentService.deleteById(id);
         System.out.println("You have successfully deleted payment with the ID :"+id);
    }
	
	
}


