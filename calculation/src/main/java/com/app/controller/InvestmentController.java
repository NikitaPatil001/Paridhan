package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Investment;
import com.app.servise.InvestmetnServise;

@RestController
@RequestMapping("/investment")
public class InvestmentController {
	@Autowired
	private InvestmetnServise investServise;

	@PostMapping("/add")
	public ResponseEntity<?> addItem(@RequestBody Investment item) {
		item.setTotalAmount(item.getQuantity() * item.getUnitPrice());
		return new ResponseEntity<>(investServise.addItem(item), HttpStatus.OK);
	}
}
