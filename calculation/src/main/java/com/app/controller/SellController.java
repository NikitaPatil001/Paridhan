package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Sell;
import com.app.servise.SellService;

@RequestMapping("/sell")
@RestController
public class SellController {
	@Autowired
	private SellService sellService;

	@PostMapping("/add")
	public ResponseEntity<?> addItem(@RequestBody Sell sell) {
		sell.setTotalAmount(sell.getQuantity() * sell.getUnitPrice());
		return new ResponseEntity<>(sellService.addItem(sell), HttpStatus.OK);
	}
}
