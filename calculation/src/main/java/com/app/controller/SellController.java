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

import com.app.pojo.Sell;
import com.app.servise.SellService;

@RequestMapping("/sell")
@RestController
public class SellController {
	@Autowired
	private SellService sellService;

	@PostMapping("/addItem")
	public ResponseEntity<?> addItem(@RequestBody Sell sell) {
		sell.setTotalAmount(sell.getQuantity() * sell.getUnitPrice());
		return new ResponseEntity<>(sellService.addItem(sell), HttpStatus.OK);
	}

	@GetMapping("/listOfItem")
	public ResponseEntity<?> getAllSellList() {
		return new ResponseEntity<>(sellService.getAllSellDetails(), HttpStatus.OK);
	}

	@GetMapping("/totalSell")
	public ResponseEntity<?> getTotalSell() {
		return new ResponseEntity<>(sellService.getTotalSell(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		return new ResponseEntity<>(sellService.deleteItem(id), HttpStatus.OK);
	}

	@PutMapping("/updateItem/{id}")
	public ResponseEntity<?> updateItem(@RequestBody Sell sell, @PathVariable int id) {
		sell.setSrNo(id);
		sell.setTotalAmount(sell.getQuantity() * sell.getUnitPrice());
		return new ResponseEntity<>(sellService.updateItem(sell), HttpStatus.OK);
	}
}
