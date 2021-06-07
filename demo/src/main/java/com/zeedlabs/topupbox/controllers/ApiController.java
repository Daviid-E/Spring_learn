package com.zeedlabs.topupbox.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeedlabs.topupbox.models.BaseResponse;
import com.zeedlabs.topupbox.service.ApiService;

@RestController
public class ApiController {
    @Autowired
    ApiService apiService; 
    
    @RequestMapping(value = "/template/products")
	   public BaseResponse getApi() {
		   BaseResponse baseResponse = apiService.getProductList();
		   return baseResponse;
	   }
}
