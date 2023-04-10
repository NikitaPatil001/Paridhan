package com.app.servise;

import java.util.List;

import com.app.pojo.Sell;

public interface SellService {
	Sell addItem(Sell sellItem);

	List<Sell> getAllSellDetails();

	Integer getTotalSell();

	String deleteItem(Integer id);

	Sell updateItem(Sell item);
}
