package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping("/addItem")
	public ResponseEntity<?> addItem(@RequestBody Investment item) {
		item.setTotalAmount(item.getQuantity() * item.getUnitPrice());
		return new ResponseEntity<>(investServise.addItem(item), HttpStatus.OK);
	}

	@DeleteMapping("/deleteItem/{id}")
	public ResponseEntity<?> deleteByItem(@PathVariable int id) {
		return new ResponseEntity<>(investServise.deleteItem(id), HttpStatus.OK);
	}

	@PutMapping("/updateItem{id}")
	public ResponseEntity<?> updateById(@RequestBody Investment investment, @PathVariable int id) {
		investment.setSrNo(id);
		investment.setTotalAmount(investment.getQuantity() * investment.getUnitPrice());
		return new ResponseEntity<>(investServise.updateItem(investment), HttpStatus.OK);
	}

	@GetMapping("/totalInvest")
	public ResponseEntity<?> getTotalInvest() {
		return new ResponseEntity<>(investServise.getTotalInvestment(), HttpStatus.OK);
	}

	@GetMapping("/getTotalItem")
	public ResponseEntity<?> getTotalItemList() {
		return new ResponseEntity<>(investServise.getTotalList(), HttpStatus.OK);
	}
}
