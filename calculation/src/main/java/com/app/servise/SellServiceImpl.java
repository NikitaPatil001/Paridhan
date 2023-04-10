package com.app.servise;

import java.util.List;

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

	@Override
	public List<Sell> getAllSellDetails() {
		return sellRepo.findAll();
	}

	@Override
	public Integer getTotalSell() {
		return sellRepo.getTotalSell();
	}

	@Override
	public String deleteItem(Integer id) {
		String item = sellRepo.findById(id).get().getItemName();
		return item + "Deleted Successfully";
	}

	@Override
	public Sell updateItem(Sell item) {
		return sellRepo.save(item);
	}
}
