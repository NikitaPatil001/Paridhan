package com.app.servise;

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
}
