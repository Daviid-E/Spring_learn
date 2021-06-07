package com.zeedlabs.topupbox.repository;

import com.zeedlabs.topupbox.entities.Payment;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payment,Long>{
	List<Payment> findAll();

	//Payment delete();
	//Optional<Payment> findAllById(Long valueOf);
   
}
