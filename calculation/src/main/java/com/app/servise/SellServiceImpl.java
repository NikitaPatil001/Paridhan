package com.app.servise;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SellRepo;
import com.app.pojo.Sell;

@Service
@Transactional
public class SellServiceImpl implements SellService {
	@Autowired
	private SellRepo sellRepo;

	@Override
	public Sell addItem(Sell sellItem) {
		return sellRepo.save(sellItem);
	}
}
