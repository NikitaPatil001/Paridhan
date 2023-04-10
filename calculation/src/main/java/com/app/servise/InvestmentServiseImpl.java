package com.app.servise;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.InvestmentRepo;
import com.app.pojo.Investment;

@Service
@Transactional
public class InvestmentServiseImpl implements InvestmetnServise {
	@Autowired
	private InvestmentRepo investRepo;

	@Override
	public Investment addItem(Investment investment) {
		return investRepo.save(investment);
	}

	@Override
	public String deleteItem(Integer id) {
		String item = investRepo.findById(id).get().getItem();
		return item + " Deleted succefully";
	}

	@Override
	public Investment updateItem(Investment item) {
		return investRepo.save(item);
	}

	@Override
	public Integer getTotalInvestment() {
		return investRepo.getTotalInvestment();
	}

	@Override
	public List<Investment> getTotalList() {
		return investRepo.findAll();
	}
}
